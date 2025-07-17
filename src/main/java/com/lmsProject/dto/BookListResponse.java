package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record BookListResponse(
        @JsonProperty("bookList")
        List<Book> bookList) {
}
