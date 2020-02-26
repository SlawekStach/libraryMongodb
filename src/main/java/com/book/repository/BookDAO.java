package com.book.repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDAO {

private final BookRepository bookRepository;

    public BookDAO(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }




}
