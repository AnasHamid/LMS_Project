package com.lmsProject.resource;

import com.lmsProject.dto.AddBooksRequest;
import com.lmsProject.dto.BookListResponse;
import com.lmsProject.dto.DeleteBooksByNameRequest;
import com.lmsProject.service.BookStoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "LMS Book Store", description = "Book Store Management")
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    /**
     * Api exposed to get book list.
     */
    @Operation(
            summary = "Fetch all Books registered",
            description = "fetches all the registered books and their data from Library")
    @RequestMapping(value = "/getBookList",
            produces = "application/json",
            method = RequestMethod.GET)
    public ResponseEntity<BookListResponse> getBookList() {
        return bookStoreService.getBookList();
    }

    /**
     * Api exposed to add books in book store.
     */
    @Operation(
            summary = "Registers list of Books",
            description = "registers list of books their data in the Library System")
    @RequestMapping(value = "/addBooks",
            produces = "application/json",
            method = RequestMethod.POST)
    public ResponseEntity<String> addBooks(@RequestBody AddBooksRequest addBookRequest) {
        return bookStoreService.addBooks(addBookRequest);
    }

    /**
     * Api exposed to delete books in book store by name.
     */
    @Operation(
            summary = "Deletes list of Books",
            description = "deletes list of books on the basis of their name from the Library System")
    @RequestMapping(value = "/deleteBooksByName",
            produces = "application/json",
            method = RequestMethod.POST)
    public ResponseEntity<String> deleteBooksByName(@RequestBody DeleteBooksByNameRequest deleteBooksByNameRequest) {
        return bookStoreService.deleteBooksByName(deleteBooksByNameRequest);
    }

}
