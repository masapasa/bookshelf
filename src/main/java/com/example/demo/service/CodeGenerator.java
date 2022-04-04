package com.example.demo.service;

import org.springframework.stereotype.Repository;

import java.util.Random;
@Repository
public class CodeGenerator {
    static final int NUM_CHARS_SHORT_LINK = 3;
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    Random random = new Random();
    public String getCode() {
        return String.valueOf(ALPHABET.charAt(random.nextInt(ALPHABET.length()))) +
                String.valueOf(ALPHABET.charAt(random.nextInt(ALPHABET.length()))) +
                String.valueOf(ALPHABET.charAt(random.nextInt(ALPHABET.length())));

    }
}
