package za.co.flexpay.funding.api.wsclient;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import za.co.flexpay.funding.api.model.SwiftFundingResponse;
import za.co.flexpay.funding.api.model.SwiftInFundingRequest;

@Service
public class SwiftFundingServiceClient {

    private static final Logger LOG = LoggerFactory.getLogger(SwiftFundingServiceClient.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${flexpay.customer-api.service.url}")
    private String otpServiceUrl;

    /**
     * @param swiftInFundingRequest
     * @return
     */
    public SwiftFundingResponse swiftFundAccount(SwiftInFundingRequest swiftInFundingRequest) {

        SwiftFundingResponse swiftFundingResponse = null;
        try {
            swiftFundingResponse = restTemplate.postForObject(otpServiceUrl, swiftInFundingRequest, SwiftFundingResponse.class);
        } catch (Exception e) {
            LOG.error(String.format("Error calling service[%s]", otpServiceUrl), e);
        }
        return swiftFundingResponse;
    }
}
