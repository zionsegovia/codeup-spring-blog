package com.codeup.codeupspringblog.models;

public class Coffee {
    public Coffee(String roast) {
        this.roast = roast;
    }

    private String roast;
    private String origin;

    private String Brand;

    public Coffee(String roast, String origin, String brand) {
        this.roast = roast;
        this.origin = origin;
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Coffee() {
    }

    public Coffee(String roast, String origin) {
        this.roast = roast;
        this.origin = origin;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}