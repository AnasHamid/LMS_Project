package com.lmsProject.service;

import com.lmsProject.builder.BookBuilder;
import com.lmsProject.constant.Constants;
import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.BookListResponse;
import com.lmsProject.entity.BookStore;
import com.lmsProject.repository.BookStoreRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookStoreServiceImpl.class);

    @Autowired
    private BookBuilder bookBuilder;

    @Autowired
    private BookStoreRespository bookStoreRespository;

    @Override
    public ResponseEntity<BookListResponse> getBookList() {
        return new ResponseEntity<>(BookListResponse.builder()
                .bookList(bookBuilder.getBookList()).build(), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<String> addBooks(AddBooksRequest addBooksRequest) {
        try {
            if (Objects.nonNull(addBooksRequest) && addBooksRequest.bookList().isEmpty())
                return new ResponseEntity<>(Constants.BOOK_ADDITION_SUCCESSFUL_MESSAGE, HttpStatus.BAD_REQUEST);

            List<BookStore> bookStoreList = bookBuilder.getBookStoreList(addBooksRequest);
            bookStoreRespository.saveAll(bookStoreList);
        } catch (Exception exception) {
            LOGGER.error("BookStoreServiceImpl - addBooks - exception occurred : {}", exception.getMessage());
            throw exception;
        }
        return new ResponseEntity<>(Constants.BOOK_ADDITION_SUCCESSFUL_MESSAGE, HttpStatus.ACCEPTED);
    }
}
