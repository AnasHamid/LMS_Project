package com.lmsProject.service;

import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.BookListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BookStoreService {

    ResponseEntity<BookListResponse> getBookList();

    ResponseEntity<String> addBooks(AddBooksRequest addBooksRequest);
}
