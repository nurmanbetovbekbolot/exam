package com.company.task3;

public class Book {
    String id;
    double price;
    int year;
    double discount;

    public Book(String id, double price, int year) {
        this.id = id;
        this.price = price;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiscount(){
        return price-(price*discount/100);
    }
}
