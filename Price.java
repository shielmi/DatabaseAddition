package com.example.michaelshiel.databaseaddition;

import java.util.List;
import java.util.Map;

/**
 * Created by michaelshiel on 10/04/2018.
 */

public class Price {
    private String name;
    private String currency;
    private String price;
    private String quantity;
    private String weight;
    private String measurement;
    public Price(){
    }

    public Price(String name, String currency, String price, String quantity, String weight, String measurement)
    {
        this.name = name;
        this.currency = currency;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
}
