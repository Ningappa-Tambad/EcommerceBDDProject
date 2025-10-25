package BddCucumber.Example1.dummy.Pages;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckOutPage extends BasePage
{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="billing_first_name") private WebElement billingfirstNameField;
    @FindBy(id="billing_last_name") private WebElement billinglastNameField;
    @FindBy(id="billing_phone") private WebElement billingphoneField;
    @FindBy(id="select2-billing_country-container") private WebElement billingcountryField;
    @FindBy(xpath="//input[@class='select2-search__field']") private WebElement searchCountryTextField;
    @FindBy(id="billing_address_1") private WebElement billingaddressField;
    @FindBy(id="billing_city") private WebElement billingcityField;
    @FindBy(id="select2-billing_state-container") private WebElement billingstateField;
    @FindBy(xpath="//input[@class='select2-search__field']") private WebElement searchStateTextField;
    @FindBy(id="billing_postcode") private WebElement billingpostcodeField;
    @FindBy(id="billing_email") private WebElement billingemailField;
    @FindBy(id="place_order") private WebElement placeOrderButton;
    @FindBy(xpath="//p[text()='Thank you. Your order has been received.']") private WebElement orderConfirmationMessage;

    public CheckOutPage enterBillingFirstName(String billingFirstName)
    {
        WebElement firstname=wait.until(ExpectedConditions.visibilityOf(billingfirstNameField));
        firstname.clear();
        firstname.sendKeys(billingFirstName);
        return this;
    }

    public CheckOutPage enterBillingLastName(String billingLastName)
    {
        WebElement lastname=wait.until(ExpectedConditions.visibilityOf(billinglastNameField));
        lastname.clear();
        lastname.sendKeys(billingLastName);
        return this;
    }

    public CheckOutPage enterBillingPhone(String billingPhone)
    {
        WebElement phone=wait.until(ExpectedConditions.visibilityOf(billingphoneField));
        phone.clear();
        phone.sendKeys(billingPhone);
        return this;
    }

    public CheckOutPage selectBillingCountry(String country)
    {
        wait.until(ExpectedConditions.elementToBeClickable(billingcountryField)).click();
        WebElement searchCountry=wait.until(ExpectedConditions.visibilityOf(searchCountryTextField));
        searchCountry.sendKeys(country);
        By desiredCountry=By.xpath("//li[contains(text(),'"+country+"')]");
        wait.until(ExpectedConditions.elementToBeClickable(desiredCountry)).click();
        return this;
    }

    public CheckOutPage enterBillingAddress(String billingAddress)
    {
        WebElement address=wait.until(ExpectedConditions.visibilityOf(billingaddressField));
        address.clear();
        address.sendKeys(billingAddress);
        return this;
    }

    public CheckOutPage enterBillingCity(String billingCity)
    {
        WebElement city=wait.until(ExpectedConditions.visibilityOf(billingcityField));
        city.clear();
        city.sendKeys(billingCity);
        return this;
    }

    public CheckOutPage selectBillingState(String state)
    {
        wait.until(ExpectedConditions.elementToBeClickable(billingstateField)).click();
        WebElement searchState=wait.until(ExpectedConditions.visibilityOf(searchStateTextField));
        searchState.sendKeys(state);
        By desiredState=By.xpath("//li[contains(text(),'"+state+"')]");
        wait.until(ExpectedConditions.elementToBeClickable(desiredState)).click();
        return this;
    }

    public CheckOutPage enterBillingPostcode(String billingPostcode)
    {
        WebElement postcode=wait.until(ExpectedConditions.visibilityOf(billingpostcodeField));
        postcode.clear();
        postcode.sendKeys(billingPostcode);
        return this;
    }

    public CheckOutPage enterBillingEmail(String billingEmail)
    {
        WebElement email=wait.until(ExpectedConditions.visibilityOf(billingemailField));
        email.clear();
        email.sendKeys(billingEmail);
        return this;
    }

    public CheckOutPage setBilingDetails(BillingDetails billingDetails)
    {
        return enterBillingFirstName(billingDetails.getBillingFirstName()).
                enterBillingLastName(billingDetails.getBillingLastName()).
                enterBillingPhone(billingDetails.getBillingPhone()).
                selectBillingCountry(billingDetails.getBillingCountry()).
                enterBillingAddress(billingDetails.getBillingAddress()).
                enterBillingCity(billingDetails.getBillingCity()).
                selectBillingState(billingDetails.getBillingState()).
                enterBillingPostcode(billingDetails.getBillingZipcode()).
                enterBillingEmail(billingDetails.getBillingEmail());

    }


    public CheckOutPage placeOrder()
    {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
        return this;
    }

    public String verifyConfirmationMessage()
    {
        return wait.until(ExpectedConditions.visibilityOf(orderConfirmationMessage)).getText();
    }


}
