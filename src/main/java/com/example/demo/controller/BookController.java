package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {
    @GetMapping
    public Book book (Book book) {
        new BookService().complete(book);
        return book;

    }

}
