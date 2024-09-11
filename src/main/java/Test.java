import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class Test {




//
//        private Map<String, Object> requestBody = new HashMap<>();
//        private Response response;
//
//        @Given("the room dimensions are {int}x{int}")
//        public void setRoomDimensions(int x, int y) {
//            requestBody.put("roomSize", new int[] {x, y});
//        }
//
//        @Given("the hoover starts at coordinates ({int}, {int})")
//        public void setHooverStartPosition(int x, int y) {
//            requestBody.put("coords", new int[] {x, y});
//        }
//
//        @Given("there are dirt patches at the following coordinates:")
//        public void setDirtPatches(io.cucumber.datatable.DataTable dataTable) {
//            requestBody.put("patches", dataTable.asLists(Integer.class));
//        }
//
//        @When("the hoover receives the instructions {string}")
//        public void sendHooverInstructions(String instructions) {
//            requestBody.put("instructions", instructions);
//
//            // Send the request to the service
//            response = given()
//                    .contentType("application/json")
//                    .body(requestBody)
//                    .when()
//                    .post("http://localhost:8080/v1/cleaning-sessions");
//        }
//
//        @Then("the hoover should be at coordinates ({int}, {int})")
//        public void verifyFinalCoordinates(int x, int y) {
//            // Use getObject() to retrieve an array
//            int[] finalCoords = response.jsonPath().getObject("coords", int[].class);
//            assertEquals(x, finalCoords[0]);
//            assertEquals(y, finalCoords[1]);
//        }
//
//        @Then("the hoover should have cleaned {int} patches of dirt")
//        public void verifyCleanedPatches(int cleanedPatches) {
//            int patchesCleaned = response.jsonPath().getInt("patches");
//            assertEquals(cleanedPatches, patchesCleaned);
//        }

}
