package org.sang.model;

import javax.persistence.*;

/**
 * Created by sang on 2018/7/15.
 */
@Entity(name = "ta")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    private Integer ll;


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ll=" + ll +
                '\'' +
                '}';
    }


    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Integer getLl() {
        return ll;
    }

    public void setLl(Integer ll) {
        this.ll = ll;
    }
}
