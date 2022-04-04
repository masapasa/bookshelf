package com.example.demo.model;

import java.rmi.server.UID;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private String code;
    private String author;
    private String description;
    private int yearOfPublication;
    private double rating;
    private String isbn;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Book() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public double getRating() {
        return rating;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book(String title, String author, String description, int yearOfPublication, String isbn) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.yearOfPublication = yearOfPublication;
        this.isbn = isbn;
        id = null;
        code = null;
        rating = 0;
    }

}
