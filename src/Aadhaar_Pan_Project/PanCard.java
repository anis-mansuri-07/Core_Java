package Aadhaar_Pan_Project;

public class PanCard {
    private String panNumber;
    private String aadhaarNumber;
    private String bankDetails;
    private String investment;

    public PanCard(String panNumber, String aadhaarNumber, String bankDetails, String investment) {
        this.panNumber = panNumber;
        this.aadhaarNumber = aadhaarNumber;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "PanCard{" +
                "panNumber='" + panNumber + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
