package BddCucumber.Example1.dummy.Customtype;

import BddCucumber.Example1.dummy.DomainObject.BillingDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDatatableType
{

@DataTableType
public BillingDetails billingDetailsEntry(Map<String, String> entry)
    {
        return new BillingDetails(
                entry.get("firstname"),
                entry.get("lastname"),
                entry.get("country"),
                entry.get("address"),
                entry.get("city"),
                entry.get("state"),
                entry.get("zip_code"),
                entry.get("phone"),
                entry.get("email")
        );
    }
}
