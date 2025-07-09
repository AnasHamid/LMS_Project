package com.lmsProject.service;

import com.lmsProject.dto.Book;
import com.lmsProject.dto.BookListResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    public ResponseEntity<BookListResponse> getBookList() {
        Book b1 = new Book(1, "Origin", "Dan Brown");
        Book b2 = new Book(1, "Angels And Demons", "Dan Brown");
        Book b3 = new Book(1, "It Ends With Us", "Cooleen Hoover");
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        BookListResponse bookListResponse = new BookListResponse(bookList);
        return new ResponseEntity<>(bookListResponse, HttpStatus.ACCEPTED);
    }
}
