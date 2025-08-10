package com.lmsProject.service;

import com.lmsProject.dto.DeleteBooksRequest;

public interface BookDeletionMethod {

    String deleteBooks(DeleteBooksRequest deleteBooksRequest);
}
