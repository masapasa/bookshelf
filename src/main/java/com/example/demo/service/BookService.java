package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;
@Service
public class BookService {
    @Autowired
    private CodeGenerator codeGenerator;
    public void complete (Book book) {
        book.setId(UUID.randomUUID());
        book.setCode(codeGenerator.getCode());
        book.setRating(new Random().nextDouble());
    }
}
