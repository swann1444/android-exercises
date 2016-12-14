package fr.android.androidexercises;

import android.renderscript.Short3;

/**
 * Created by Swann Legrand on 14/12/2016.
 */

public class Book {

    private String isbn;
    private String title;
    private String cover;
    private double price;

    public Book(String is, String t, String c, double pr){
        isbn = is;
        title = t;
        cover = c;
        price = pr;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {

        return isbn;
    }
}
