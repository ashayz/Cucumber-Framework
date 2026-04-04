package utils;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class APIUtils {

    String baseURI;
    public void setBaseURI(String URI){
        baseURI = URI;
    }

    public Response getResponse(String endpoint, String request,Object body){
        Response response;
        response = switch (request.toUpperCase()) {
            case "GET" -> given()
                    .when().get(baseURI+endpoint);
            case "POST" -> given()
                    .header("Content-Type", "application/json")
                    .body(body)
                    .when()
                    .post(baseURI+endpoint);
            case "PUT" -> given()
                    .header("Content-Type", "application/json")
                    .body(body)
                    .when()
                    .put(baseURI+endpoint);
            case "DELETE" -> given()
                    .when()
                    .delete(baseURI+endpoint);
            default -> throw new IllegalArgumentException("Invalid request type: " + request);
        };
        return response;
    }
}
