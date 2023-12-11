package com.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooksBorrowedByUserOnDateRange(Long userId, Date from, Date to) {
        // TODO -- Call it when the regarding query added in the repository.
        // return this.bookRepository.getAllBooksBorrowedByUserOnDateRange(userId, from, to);
        return null;
    }

    public List<Book> getAllBooksNotBorrowed() {
        // TODO -- Call it when the regarding query added in the repository.
        // return this.bookRepository.getAllBooksNotBorrowed();
        return null;
    }
}
