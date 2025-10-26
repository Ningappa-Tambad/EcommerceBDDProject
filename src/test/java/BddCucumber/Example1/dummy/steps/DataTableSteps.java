package BddCucumber.Example1.dummy.steps;

import BddCucumber.Example1.dummy.object.Customer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.PendingException;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTableSteps {

@DataTableType
public Customer convertCustomer(DataTable dataTable) {
    return new Customer(dataTable.row(0).get(0), dataTable.row(1).get(1));
}

    @Given("User is on the login page")
    public void userIsOnTheLoginPage(@Transpose Customer customer) {
        // Write code here that turns the phrase above into concrete actions

       // List<List<String>> creds=dataTable.asLists();

        System.out.println("USER NAME  "+customer.getUsername());
        System.out.println(" PASSWORD   "+customer.getPassword());




    }


    }

