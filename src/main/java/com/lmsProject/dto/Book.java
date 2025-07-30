package com.lmsProject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Book {
    @NonNull
    @JsonProperty("bookRegistrationNumber")
    private String bookRegistrationNumber;
    @NonNull
    @JsonProperty("bookName")
    private String bookName;
    @NonNull
    @JsonProperty("authorName")
    private String authorName;
    @NonNull
    @JsonProperty("publisherName")
    private String publisherName;
}

