package com.library.librarymanagmentsystem.Entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name  ="title")
    private String title;
    @Column(name  ="author")
    private String author;
    @Column(name  ="publicationyear")
    private LocalDate publicationyear;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
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
    public LocalDate getPublicationyear() {
        return publicationyear;
    }
    public void setPublicationyear(LocalDate publicationyear) {
        this.publicationyear = publicationyear;
    }



}
