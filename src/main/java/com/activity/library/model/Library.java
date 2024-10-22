package com.activity.library.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//A fim de possibilitar a conversa entre o Spring e o BD deve-se indicar o nome deste exatamente como foi criado.
@Table(name="library")
//Data trará métodos GETTERS e SETTERS 
@Data
@NoArgsConstructor
public class Library {
    
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "author", length = 50)
    private String author;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(name = "genre", length = 15)
    private String genre;

    @Column(name = "isbn", length = 50)
    private String isbn;

    @Column(name = "language", length = 50)
    private String language;

    @Column(name = "page_count")
    private Integer pageCount;
    
    @Column(name = "publisher", length = 50)
    private String publisher;

    @Column(name = "available_copies")
    private Integer availableCopies;

    @Column(name = "library_location", length = 50)
    private String librarylocation;

    public Library(String bookTitle, String author, LocalDate publicationDate, String genre, String isbn,
            String language, Integer pageCount, String publisher, Integer availableCopies, String librarylocation) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.isbn = isbn;
        this.language = language;
        this.pageCount = pageCount;
        this.publisher = publisher;
        this.availableCopies = availableCopies;
        this.librarylocation = librarylocation;
    }
}
