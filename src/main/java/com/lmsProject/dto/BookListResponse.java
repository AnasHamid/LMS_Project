package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.List;

@JsonPOJOBuilder
public record BookListResponse(
        @JsonProperty("bookList")
        List<Book> bookList) {
}
