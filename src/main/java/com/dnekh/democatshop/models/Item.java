package com.dnekh.democatshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private long id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String info;

    @Getter
    @Setter
    private String img;

    @Getter
    @Setter
    private int price;

    public Item() {}

    public Item(String title, String info, String img, int price) {
        this.title = title;
        this.info = info;
        this.img = img;
        this.price = price;
    }
}
