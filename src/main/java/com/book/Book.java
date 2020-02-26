package com.book;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collation = "books")
public class Book {

    @Id
    private String id;
    private String title;
    private String genre;
    private Integer releaseDate;
    private Boolean availability;
    private String hirer;


    public Book(String id, String title, String genre, Integer releaseDate, Boolean availability, String hirer) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.hirer = hirer;
    }

}
