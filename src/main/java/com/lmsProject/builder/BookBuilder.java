package com.lmsProject.builder;

import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.Book;
import com.lmsProject.entity.BookStore;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookBuilder {

    public List<Book> getBookList() {
        Book b1 = Book.builder().bookId(1).bookName("Origin").authorName("Dan Brown").publisherName("Modern House").build();
        Book b2 = Book.builder().bookId(2).bookName("Angels And Demons").authorName("Dan Brown").publisherName("Modern House").build();
        Book b3 = Book.builder().bookId(3).bookName("It Ends With Us").authorName("Colleen Hoover").publisherName("Goel Publiction Prakashan").build();
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
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
                .bookName(book.getBookName())
                .authorName(book.getAuthorName())
                .publisherName(book.getPublisherName()).build();
    }

}
