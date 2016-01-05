package com.baykusgrup.baskentuni.model;

/**
 * Created by TAYİP on 31.12.2015.
 */
public class Yemek {

    String date, menu;

    public Yemek(String date, String menu) {
        this.date = date;
        this.menu = menu;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }
}
