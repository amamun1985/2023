package amazon.api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WileyApiTC1 {
    private static final Logger LOGGER= LogManager.getLogger(WileyApiTC1.class);
    @Test
    public void getAllUsers(){
        RestAssured.baseURI="https://www.wiley.com/en-us/search/autocomplete/comp_00001H9J?term=Java";
        RequestSpecification httpRequest=RestAssured.given();
        Response response=httpRequest.request(Method.GET);
        //LOGGER.debug(response.getBody().prettyPrint());
        LOGGER.debug("Actual status code : "+response.getStatusCode());

        Assert.assertEquals(response.getStatusCode(),200);
        String responseBody=response.getBody().asString();
        Assert.assertEquals(responseBody.contains("Wiley"),true);


        JsonPath jsonPath=response.jsonPath();
        Assert.assertEquals(jsonPath.get("title"),"Wiley");
       // String record=jsonPath.getString("suggestions[3]");
        //Assert.assertNotNull(record,"user record is null");
    }
}
