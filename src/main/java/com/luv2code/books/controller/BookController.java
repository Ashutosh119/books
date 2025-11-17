package com.luv2code.books.controller;

import com.luv2code.books.entity.Book;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private final List<Book> books = new ArrayList<>();

    private void initializeBooks(){
        books.addAll(List.of(
                new Book("Title One", "Author One", "Science"),
                new Book("Title Two", "Author Two", "Science"),
                new Book("Title Three", "Author Three", "History"),
                new Book("Title Four", "Author Four", "Math"),
                new Book("Title Five", "Author Five", "Math"),
                new Book("Title Six", "Author Six", "Math")
        ));
    }



}
