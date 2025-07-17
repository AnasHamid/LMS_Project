package com.lmsProject.service;

import com.lmsProject.constant.Constants;
import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.Book;
import com.lmsProject.dto.BookListResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookStoreServiceImpl.class);

    public ResponseEntity<BookListResponse> getBookList() {
        Book b1 = new Book(1, "Origin", "Dan Brown", "Modern House");
        Book b2 = new Book(1, "Angels And Demons", "Dan Brown", "Modern House");
        Book b3 = new Book(1, "It Ends With Us", "Cooleen Hoover", "Goel Publiction Prakashan");
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        BookListResponse bookListResponse = new BookListResponse(bookList);
        return new ResponseEntity<>(bookListResponse, HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<String> addBooks(AddBooksRequest addBooksRequest) {
        try {
            LOGGER.error("BookStoreServiceImpl - addBooks - api to add books");
        } catch (Exception exception) {
            LOGGER.error("BookStoreServiceImpl - addBooks - exception occurred : {}", exception.getMessage());
            throw exception;
        }

        return new ResponseEntity<>(Constants.BOOK_ADDITION_SUCCESSFUL_MESSAGE, HttpStatus.ACCEPTED);
    }
}
