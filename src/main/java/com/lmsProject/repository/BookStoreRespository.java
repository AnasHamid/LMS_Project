package com.lmsProject.repository;

import com.lmsProject.entity.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRespository extends JpaRepository<BookStore, Long> {

}
