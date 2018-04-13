package com.example.demo;

import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private String isbnNumber;
    private LocalDate yearOfPublication;
    private  boolean inStock= true;;

    public  Book(){

    }

    public Book(String title, String author, String isbnNumber, LocalDate yearOfPublication, boolean inStock) {
        this.title = title;
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.yearOfPublication = yearOfPublication;
        this.inStock = inStock;
    }


    public String getTitle() {
        return title;
    }


    public Book(String title, String author, String description, boolean inStock) {
        this.title = title;
        this.author = author;
        this.isbnNumber = isbnNumber;
        this.inStock = inStock;
    }


    public void getDisplayText() {
        System.out.println(getAuthor());
        System.out.println(getTitle());
        System.out.println(getIsbnNumber());
         System.out.println(getYearOfPublication());
        System.out.println(isInStock());
 //System.out.println("Title ");
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(LocalDate yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", inStock=" + inStock +
                '}';
    }
}
