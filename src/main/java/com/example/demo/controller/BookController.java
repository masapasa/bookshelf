package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    List<Book> allbooks = new ArrayList<Book>();

    @GetMapping
    public Book book (Book book) {
        new BookService().complete(book);
        allbooks.add(book);
        return book;

    }
    @GetMapping(path="/api/v1/books/all")
    public List<Book> books() {
        return allbooks;
    }

}
