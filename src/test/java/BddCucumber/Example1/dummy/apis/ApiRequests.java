//package BddCucumber.Example1.dummy.apis;
//
//import BddCucumber.Example1.dummy.DomainObject.Cookies;
//import io.restassured.http.Headers;
//import io.restassured.response.Response;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static BddCucumber.Example1.dummy.apis.SpecBuilder.getRequestSpec;
//import static io.restassured.RestAssured.given;
//
//public class ApiRequests extends SpecBuilder {
//
//    //create reusable API methods
//
//    public static Response post(String endpoint, Headers headers, HashMap<String, Object> formParams, Cookies cookies) {
//
//       return given(getRequestSpec())
//                .headers(headers)
//                .formParams(formParams)
//                .cookies((Map<String, ?>) cookies)
//                .when()
//                .post(endpoint)
//                .then().spec("TEST")
//                .extract()
//                .response();
//    }
//}
