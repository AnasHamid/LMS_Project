package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record DeleteBooksRequest(
        @JsonProperty("bookNamesList")
        List<String> bookNamesList,

        @JsonProperty("bookRegistrationNumberList")
        List<String> bookRegistrationNumberList) {
}
