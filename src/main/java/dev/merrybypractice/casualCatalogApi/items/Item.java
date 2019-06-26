package dev.merrybypractice.casualCatalogApi.items;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Item {
    //needs title property
    private String title;

    //title getter
    public String getTitle() {
        return title;
    }

    //title setter
    public void setTitle(String title) {
        this.title = title;
    }

    // needs gift boolean
    private boolean gift;

    //gift getter
    public boolean isGift() {
        return gift;
    }

    //gift setter
    public void setGift(boolean gift) {
        this.gift = gift;
    }

    // needs current location
    private String location = null;

    //location getter
    public String getLocation() {
        return location;
    }

    //location setter
    public void setLocation(String location) {
        this.location = location;
    }

    //needs creator property - list *
    private List<String> creator = null;

    public List<String> getCreator() {
        return creator;
    }

    public void setCreator(List<String> creator) {
        this.creator = creator;
    }

    // needs acquired date *
    private Date aquiredDate = null;

    //acquired date getter

    public Date getAquiredDate() {
        return aquiredDate;
    }

    //acquired date setter

    public void setAquiredDate(Date aquiredDate) {
        this.aquiredDate = aquiredDate;
    }

    // needs acquired location *
    private String aquiredLocation = null;

    //get Acquired Location

    public String getAquiredLocation() {
        return aquiredLocation;
    }

    //set Acquired Location

    public void setAquiredLocation(String aquiredLocation) {
        this.aquiredLocation = aquiredLocation;
    }

    // needs acquired price *
    private Long aquiredPrice = null;

    //get acquired price

    public Long getAquiredPrice() {
        return aquiredPrice;
    }

    //set acquired price

    public void setAquiredPrice(Long aquiredPrice) {
        this.aquiredPrice = aquiredPrice;
    }

    //possible options:
    // place in a series?
}
