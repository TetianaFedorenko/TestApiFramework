
package factory;

import org.apache.commons.lang3.RandomStringUtils;
import pojo.post.AddPetRequest;

import java.util.LinkedList;
import java.util.List;

public class PetRequestFactory {

    public static AddPetRequest getDefaultData() {
        AddPetRequest requestData = new AddPetRequest();
        requestData.setId(0);
        requestData.setName("puppy " + RandomStringUtils.randomAlphabetic(5));
        requestData.setCategory(setPetCategory());
        requestData.setPhotoUrls(setPhotoURLs());
        requestData.setTags(setTags());
        requestData.setStatus("available");
        return requestData;
    }

    private static List<String> setPhotoURLs() {
        List<String> urlsList = new LinkedList<String>();
        urlsList.add("http://" + RandomStringUtils.randomAlphabetic(5));
        return urlsList;
    }

    private static List<AddPetRequest.Tag> setTags() {
        List<AddPetRequest.Tag> tagList = new LinkedList<AddPetRequest.Tag>();
        AddPetRequest.Tag petTags = new AddPetRequest.Tag();
        petTags.setId(0);
        petTags.setName("tagName");
        tagList.add(petTags);
        return tagList;
    }

    private static AddPetRequest.Category setPetCategory() {
        AddPetRequest.Category category = new AddPetRequest.Category();
        category.setId(0);
        category.setName("categoryName");
        return category;
    }
}

