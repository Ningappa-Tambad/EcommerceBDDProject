package BddCucumber.Example1.dummy.Customtype;

import BddCucumber.Example1.dummy.object.Product;
import io.cucumber.java.ParameterType;

public class CustomParameterType {


    @ParameterType(".*")
    public Product product(String name)
    {
        return new Product(name.replace("\"", ""));

    }
}
