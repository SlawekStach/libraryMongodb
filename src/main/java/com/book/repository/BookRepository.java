package com.book.repository;

import com.book.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findAllByOrderByTitle();

    Book findByTitle(String title);

    List<Book> findByHirerOrderByHirer(String email);



}
