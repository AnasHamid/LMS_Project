package com.lmsProject.resource;

import com.lmsProject.dto.BookListResponse;
import com.lmsProject.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    /**
     * Api exposed to get book list.
     */
    @RequestMapping("/getBookList")
    public ResponseEntity<BookListResponse> getBookList() {
        return bookStoreService.getBookList();
    }

}
