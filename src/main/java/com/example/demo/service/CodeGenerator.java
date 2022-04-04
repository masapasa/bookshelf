package com.example.demo.service;

import java.util.Random;

public class CodeGenerator {
    static final int NUM_CHARS_SHORT_LINK = 3;
    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    Random random = new Random();
    String getCode() {
        return String.valueOf(ALPHABET.charAt(random.nextInt(ALPHABET.length())));

    }
}
