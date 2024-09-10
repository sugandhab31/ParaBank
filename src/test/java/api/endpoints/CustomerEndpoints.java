package api.endpoints;

import api.payloads.Customer;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerEndpoints {

    public Response registerCustomer(Customer customerPayload){
        RestAssured.baseURI = Router.RegisterCustomer;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.body(customerPayload);

        Response response = requestSpecification.post();
        System.out.println(response.asPrettyString());
        return response;
    }

    public Response findCustomer(String customerId){
        RestAssured.baseURI = Router.FindCustomer;

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.accept(ContentType.JSON);
        requestSpecification.pathParam("customerID",customerId);

        Response response = requestSpecification.get();
        System.out.println(response.asPrettyString());
        return response;
    }
}
