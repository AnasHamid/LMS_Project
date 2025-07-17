package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AddBooksRequest {
    @JsonProperty("bookList")
    private List<Book> bookList;
}
