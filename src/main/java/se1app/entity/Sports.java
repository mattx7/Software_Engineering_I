package se1app.entity;

import se1app.types.Filterable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by MattX7 on 06.11.2016.
 */
@Entity
public enum Sports implements Filterable {
    JOGGING, SWIMMING, BIKING, HIKING, OTHER;

    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }
}
