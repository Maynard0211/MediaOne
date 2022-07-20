package com.mycompany.mediaone.Model;

import com.mycompany.SharedType.EProductType;
import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    public Product(String id, String name, EProductType type, int numberInStock, int inputPrice, int sellPrice, Date dateRelease, String category, String listActorSingerContributor, String listDirectorMusicianAuthor) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.numberInStock = numberInStock;
        this.inputPrice = inputPrice;
        this.sellPrice = sellPrice;
        this.dateRelease = dateRelease;
        this.category = category;
        this.listActorSingerContributor = listActorSingerContributor;
        this.listDirectorMusicianAuthor = listDirectorMusicianAuthor;
    }

    private String id;
    private String name;
    private EProductType type;
    private int numberInStock;
    private int inputPrice;
    private int sellPrice;
    private Date dateRelease;
    private String category;
    private String listActorSingerContributor;
    private String listDirectorMusicianAuthor;

    public String getCategory() {
        return category;
    }

    public String getListActorSingerContributor() {
        return listActorSingerContributor;
    }

    public String getListDirectorMusicianAuthor() {
        return listDirectorMusicianAuthor;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        switch (type) {
            case FILMCD:
                return "Film CD";
            case MUSICCD:
                return "Music CD";
            default:
                return "Book";
        }
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public int getInputPrice() {
        return inputPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

}
