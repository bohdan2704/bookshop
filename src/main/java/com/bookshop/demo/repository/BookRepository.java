package com.bookshop.demo.repository;

import com.bookshop.demo.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
