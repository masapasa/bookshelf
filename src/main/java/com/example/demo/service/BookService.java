package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Random;
import java.util.UUID;

public class BookService {
    private CodeGenerator codeGenerator;
    public void complete (Book book) {
        book.setId(UUID.randomUUID());
        book.setCode(new CodeGenerator().getCode());
        book.setRating(new Random().nextDouble());
    }
}
