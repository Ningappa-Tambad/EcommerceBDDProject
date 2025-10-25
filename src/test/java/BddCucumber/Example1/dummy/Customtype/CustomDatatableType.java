package BddCucumber.Example1.dummy.Customtype;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDatatableType
{


    @DataTableType
    public BillingDetails convertBillingDetails(Map<String, String> entry)
    {
        return new BillingDetails(
                entry.get("billingFirstName"),
                entry.get("billingLastName"),
                entry.get("billingCompanyName"),
                entry.get("billingEmail"),
                entry.get("billingPhone"),
                entry.get("billingCountry"),
                entry.get("billingAddress"),
                entry.get("billingCity"),
                entry.get("billingState"),
                entry.get("billingZipcode")
        );
    }
}
