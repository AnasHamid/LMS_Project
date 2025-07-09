package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonPOJOBuilder
public record Book(
        @JsonProperty("bookId")
        int bookId,
        @JsonProperty("bookName")
        String bookName,
        @JsonProperty("authorName")
        String authorName) {
}
