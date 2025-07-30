package com.lmsProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_BOOK_STORE")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookStore {
    @Id
    @SequenceGenerator(name="T_BOOK_STORE_SEQ", sequenceName="T_BOOK_STORE_SEQ", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="T_BOOK_STORE_SEQ")
    @Column(name = "ID")
    private Long id;
    @Column(name = "BOOK_REGISTRATION_NUMBER")
    private String bookRegistrationNumber;
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
    @Column(name = "UPDATED_BY", insertable = false)
    private String updatedBy;
    @Column(name = "UPDATED_AT", insertable = false)
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
