package me.jakirniloy.photogallery;

public class imageArray {
    String imageID;
    String description;

    public imageArray(String imageID, String description) {
        this.imageID = imageID;
        this.description = description;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
