package BddCucumber.Example1.dummy.apis;

import BddCucumber.Example1.dummy.utils.ConfigLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder
{

    public static RequestSpecification getRequestSpec()
    {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigLoader.getInstance().getBaseUrl())
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification getResponseSpec()
    {
        return (ResponseSpecification) new ResponseBuilder()
                .setStatusLine(String.valueOf(200))
                .setStatusCode(Integer.parseInt("application/json"))
                .build();
    }
}
