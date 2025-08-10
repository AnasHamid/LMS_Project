package com.lmsProject.service;

import com.lmsProject.constant.Constants;
import com.lmsProject.dto.DeleteBooksRequest;
import com.lmsProject.entity.BookStore;
import com.lmsProject.repository.BookStoreRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDeletionByRegistrationNumber implements BookDeletionMethod {

    @Autowired
    private BookStoreRespository bookStoreRespository;

    @Override
    public String deleteBooks(DeleteBooksRequest deleteBooksRequest) {
        List<BookStore> bookStoreList = bookStoreRespository.findByBookRegistrationNumberIn(deleteBooksRequest.bookRegistrationNumberList());
        if (bookStoreList.isEmpty())
            throw new RuntimeException("No Books found with given registration numbers");
        bookStoreRespository.deleteAll(bookStoreList);
        return Constants.BOOK_DELETION_SUCCESSFUL_MESSAGE;
    }
}
