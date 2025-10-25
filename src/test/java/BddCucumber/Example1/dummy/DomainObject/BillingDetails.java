package BddCucumber.Example1.dummy.DomainObject;

public class BillingDetails
{
    private String billingFirstName;
    private String billingLastName;
    private String billingCompanyName;
    private String billingEmail;
    private String billingPhone;
    private String billingCountry;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingZipcode;

    public BillingDetails(String billingFirstName, String billingLastName, String billingCompanyName,
                          String billingEmail, String billingPhone,
                          String billingCountry, String billingAddress, String billingCity, String billingState, String billingZipcode) {
        this.billingFirstName = billingFirstName;
        this.billingLastName = billingLastName;
        this.billingCompanyName = billingCompanyName;
        this.billingEmail = billingEmail;
        this.billingPhone = billingPhone;
        this.billingCountry = billingCountry;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZipcode = billingZipcode;
    }


    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String billingCompanyName) {
        this.billingCompanyName = billingCompanyName;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZipcode() {
        return billingZipcode;
    }

    public void setBillingZipcode(String billingZipcode) {
        this.billingZipcode = billingZipcode;
    }
}
