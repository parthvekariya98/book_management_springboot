package com.example.bookstore.service;

import com.example.bookstore.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book addBook(Book book);
    Book getBookById(Long id);
    void deleteBook(Long id);
}
