package se1app.types;

import java.io.Serializable;

/**
 * Created by MattX7 on 10.11.2016.
 */
public class ImageType implements Serializable {
    private String image;

    public ImageType(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
