package api;

public enum PetStoreEndpoint {

    ADD_PET("https://petstore.swagger.io/v2/pet"),
    GET_PET("https://petstore.swagger.io/v2/pet/%s");

    private final String endpoint;

    PetStoreEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
