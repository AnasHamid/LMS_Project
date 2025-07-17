package com.lmsProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Table(schema = "T_BOOK_STORE")
@Entity
public class BookStore {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "BOOK_NAME")
    private String bookName;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "PUBLISHER_NAME")
    private String publisherName;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_AT", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "UPDATE_BY", insertable = false)
    private String updatedBy;
    @Column(name = "UPDATE_AT", insertable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    private void onPersist() {
        this.createdBy = "admin";
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate() {
        this.updatedBy = "admin";
        this.updatedAt = LocalDateTime.now();
    }
}
