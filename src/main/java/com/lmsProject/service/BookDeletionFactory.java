package com.lmsProject.service;

import com.lmsProject.dto.DeleteBooksRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDeletionFactory {

    @Autowired
    private BookDeletionByName bookDeletionByName;

    @Autowired
    private BookDeletionByRegistrationNumber bookDeletionByRegistrationNumber;

    public BookDeletionMethod getBookDeletionStrategy(DeleteBooksRequest deleteBooksRequest) {
        if (!deleteBooksRequest.bookNamesList().isEmpty())
            return bookDeletionByName;
        else if (!deleteBooksRequest.bookRegistrationNumberList().isEmpty())
            return bookDeletionByRegistrationNumber;
        else
            throw new RuntimeException("Deletion not possible");
    }
}
