package com.lmsProject.resource;

import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.BookListResponse;
import com.lmsProject.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    /**
     * Api exposed to get book list.
     */
    @RequestMapping(value = "/getBookList",
            produces = "application/json",
            method = RequestMethod.GET)
    public ResponseEntity<BookListResponse> getBookList() {
        return bookStoreService.getBookList();
    }

    /**
     * Api exposed to add books in book store.
     */
    @RequestMapping(value = "/addBooks",
            produces = "application/json",
            method = RequestMethod.POST)
    public ResponseEntity<String> addBooks(@RequestBody AddBooksRequest addBookRequest) {
        return bookStoreService.addBooks(addBookRequest);
    }

}
