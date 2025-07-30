package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record DeleteBooksByNameRequest(
        @JsonProperty("bookNamesList")
        List<String> bookNamesList) {
}
