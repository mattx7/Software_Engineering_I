package se1app.types;

import se1app.entity.Sports;

/**
 * Created by MattX7 on 08.11.2016.
 */
public class Filter {
    private Sports categoriy;
    private Distance distance;
    private String text;

    // TODO Filter
    public Sports getCategoriy() {
        return categoriy;
    }

    public void setCategoriy(Sports categoriy) {
        this.categoriy = categoriy;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
