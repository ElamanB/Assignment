

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HooverApiTest {



    @Test
    public void testHooverCleaningSession() {
        // Set up the base URI for RestAssured
        RestAssured.baseURI = "http://localhost:8081";

        // Define the JSON payload as a String
        String jsonPayload = "{\n" +
                "  \"roomSize\" : [5, 5],\n" +
                "  \"coords\" : [1, 2],\n" +
                "  \"patches\" : [ [1, 0], [2, 2], [2, 3] ],\n" +
                "  \"instructions\" : \"NNESEESWNWW\"\n" +
                "}";

        // Send a POST request to the API and receive the response
        Response response = given()
                .header("Content-Type", "application/json")
                .body(jsonPayload)
                .when()
                .post("/v1/cleaning-sessions")
                .then()
                .assertThat()
                .statusCode(200)  // Check if the response status code is 200 (OK)
                .extract()
                .response();

        // Extract the JSON response as a String
        String jsonResponse = response.getBody().asString();

        // Verify the response contains the expected final coordinates and cleaned patches
        given().body(jsonResponse)
                .then()
                .body("coords", equalTo(new int[]{1, 3}))  // Final coordinates expected: [1, 3]
                .body("patches", equalTo(1));  // Expected patches cleaned: 1

        // Optionally, print the response for debugging purposes
        System.out.println("Response: " + jsonResponse);

        // You can also use JUnit's Assert to check values
        Assertions.assertTrue(jsonResponse.contains("\"coords\":[1,3]"));
        Assertions.assertTrue(jsonResponse.contains("\"patches\":1"));
    }
}

