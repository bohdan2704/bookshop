package com.bookshop.demo.service;

import com.bookshop.demo.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
