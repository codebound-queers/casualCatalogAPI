package dev.merrybypractice.casualCatalogApi.items;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
public class Item {
    //base item in a personal collection
        //needs title property
        public String title;
        // needs gift boolean
        public boolean gift;
        // needs current location
        public String location = null;
        //needs creator property - list *
        public List<String> creator = null;
        // needs acquired date *
        public Date aquiredDate = null;
        // needs acquired location *
        public String aquiredLocation = null;
        // needs acquired price *
        public Long aquiredPrice = null;



    //possible options:
        // place in a series?
}
