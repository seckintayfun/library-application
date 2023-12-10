package com.library.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/borrowed/{userId}/{from}/{to}")
    public List<Book> getAllBooksBorrowedByUserOnDateRange(@PathVariable(name = "userId") Long userId,
                                                           @PathVariable(name = "from")
                                                           @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                                                           @PathVariable(name = "to")
                                                           @DateTimeFormat(pattern = "yyyy-MM-dd") Date to) {
        return bookService.getAllBooksBorrowedByUserOnDateRange(userId, from, to);
    }

    @GetMapping("/notborrowed")
    public List<Book> getAllBooksNotBorrowed() {
        return bookService.getAllBooksNotBorrowed();
    }
}
