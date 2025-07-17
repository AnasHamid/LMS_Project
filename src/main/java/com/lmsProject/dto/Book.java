package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class Book {
    @JsonProperty("bookId")
    private int bookId;
    @JsonProperty("bookName")
    private String bookName;
    @JsonProperty("authorName")
    private String authorName;
    @JsonProperty("publisherName")
    private String publisherName;

    public Book(int bookId, String bookName, String authorName, String publisherName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
    }
}

