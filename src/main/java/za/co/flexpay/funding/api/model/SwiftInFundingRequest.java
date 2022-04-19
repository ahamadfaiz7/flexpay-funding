package za.co.flexpay.funding.api.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class SwiftInFundingRequest implements Serializable {

    private String systemID;
    private String financialInstitution;
    private String statementReference;


    public SwiftInFundingRequest() {
    }

    public SwiftInFundingRequest(String systemID, String financialInstitution, String statementReference) {
        this.systemID = systemID;
        this.financialInstitution = financialInstitution;
        this.statementReference = statementReference;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(String financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public String getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(String statementReference) {
        this.statementReference = statementReference;
    }
}
