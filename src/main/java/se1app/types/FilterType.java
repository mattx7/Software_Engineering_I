package se1app.types;

import java.util.List;

/**
 * Created by MattX7 on 08.11.2016.
 */
public class FilterType {
    private SportsType category;
    private DistanceType distance;
    private List<KeywordType> keywords;

    public FilterType() {
    }

    public FilterType(SportsType category) {
        this.category = category;
    }

    public FilterType(SportsType category, DistanceType distance) {
        this.category = category;
        this.distance = distance;
    }

    public FilterType(SportsType category, DistanceType distance, List<KeywordType> keywords) {
        this.category = category;
        this.distance = distance;
        this.keywords = keywords;
    }

    public List<KeywordType> getKeywords() {
        return keywords;
    }

    public void addKeyword(KeywordType keyword) {
        this.keywords.add(keyword);
    }

    public SportsType getCategory() {
        return category;
    }

    public void setCategory(SportsType category) {
        this.category = category;
    }

    public DistanceType getDistance() {
        return distance;
    }

    public void setDistance(DistanceType distance) {
        this.distance = distance;
    }


}
