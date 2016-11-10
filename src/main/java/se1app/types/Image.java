package se1app.types;

import java.io.Serializable;

/**
 * Created by MattX7 on 10.11.2016.
 */
public class Image implements Serializable {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
}
