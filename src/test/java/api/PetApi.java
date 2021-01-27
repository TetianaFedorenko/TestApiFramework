
package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import pojo.get.GetPetResponse;
import pojo.post.AddPetRequest;
import pojo.post.AddPetResponse;

public class PetApi {


public AddPetResponse addPet(AddPetRequest request) {
        AddPetResponse response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/")
                .basePath("v2/pet")
                .when()
                .body(request)
                .post().peek()
                .as(AddPetResponse.class);
        return response;
    }

    public GetPetResponse getPet(long id) {
        GetPetResponse response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/")
                .basePath(String.format("v2/pet/%s", id))
                .when()
                .get()
                .peek()
                .as(GetPetResponse.class);
        return response;
    }
}

