package pojo.post;

import core.ResponseObject;

import java.util.List;

public class AddPetResponse extends ResponseObject {

    private long id;
    private AddPetRequest.Category category;
    private String name;
    private List<String> photoUrls;
    private List<AddPetRequest.Tag> tags;
    private String status;

    //@Data
    public static class Category {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    //@Data
    public static class Tag{
        public int id;
        public String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AddPetRequest.Category getCategory() {
        return category;
    }

    public void setCategory(AddPetRequest.Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<AddPetRequest.Tag> getTags() {
        return tags;
    }

    public void setTags(List<AddPetRequest.Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
