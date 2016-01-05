package com.baykusgrup.baskentuni.model;

import java.util.ArrayList;

/**
 * Created by TAYİP on 4.1.2016.
 */
public class ServisGrup {

    public  String semtAdi;

    public ArrayList<ServisChild> items;

    public ArrayList<ServisChild> getItems() {
        return items;
    }

    public void setItems(ArrayList<ServisChild> items) {
        this.items = items;
    }

    public String getSemtAdi() {
        return semtAdi;
    }

    public void setSemtAdi(String semtAdi) {
        this.semtAdi = semtAdi;
    }
}
