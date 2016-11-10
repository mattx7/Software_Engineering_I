package se1app.types;

import se1app.entity.Sports;

import java.util.List;

/**
 * Created by MattX7 on 08.11.2016.
 */
public class Filter {
    private Sports category;
    private Distance distance;
    private List<Keyword> keywords;

    public List<Keyword> getKeywords() {
        return keywords;
    }

    public void addKeyword(Keyword keyword) {
        this.keywords.add(keyword);
    }

    public Sports getCategory() {
        return category;
    }

    public void setCategory(Sports category) {
        this.category = category;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }


}
