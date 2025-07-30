package com.lmsProject.builder;

import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.Book;
import com.lmsProject.entity.BookStore;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookBuilder {


    public List<Book> getBookList(List<BookStore> bookStoreList) {
        List<Book> bookList = new ArrayList<>();
        bookStoreList.forEach(bookStore -> {
            bookList.add(getBookEntry(bookStore));
        });
        return bookList;
    }

    public List<BookStore> getBookStoreList(AddBooksRequest addBooksRequest) {
        List<BookStore> bookStoreList = new ArrayList<>();
        addBooksRequest.bookList().forEach(book -> {
            bookStoreList.add(getBookStoreEntry(book));
        });
        return bookStoreList;
    }

    private BookStore getBookStoreEntry(Book book) {
        return BookStore.builder()
                .bookRegistrationNumber(book.getBookRegistrationNumber())
                .bookName(book.getBookName())
                .authorName(book.getAuthorName())
                .publisherName(book.getPublisherName()).build();
    }

    private Book getBookEntry(BookStore bookStore) {
        return Book.builder()
                .bookRegistrationNumber(bookStore.getBookRegistrationNumber())
                .bookName(bookStore.getBookName())
                .authorName(bookStore.getAuthorName())
                .publisherName(bookStore.getPublisherName()).build();
    }

}
