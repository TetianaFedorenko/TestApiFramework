package tests;

import api.PetApi;
import factory.PetRequestFactory;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.get.GetPetResponse;
import pojo.post.AddPetResponse;

//TODO
//Lombok
//Get Status Code
//Compare responses
public class PetStoreTests {

    PetApi petApi = new PetApi();

    @Test
    @DisplayName("Add new pet")
    void addPet() {

        AddPetResponse response = petApi.addPet(PetRequestFactory.getDefaultData());
        System.out.println(response);
        System.out.println(response.getId());
    }

    @Test
    @DisplayName("Get pet")
    void getPet() {

        AddPetResponse response = petApi.addPet(PetRequestFactory.getDefaultData());
        //Assertions.assertEquals(response.getResponse().getStatusCode(), HttpStatus.SC_OK);
        long id = response.getId();

        GetPetResponse pet = petApi.getPet(id);
        Assertions.assertEquals(pet.getName(), response.getName());
    }
}
