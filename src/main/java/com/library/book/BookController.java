package com.library.book;

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
    @GetMapping("/borrowed/{userId}/{from}/{to}")
    public List<Book> getAllBooksBorrowedByUserOnDateRange(@PathVariable(name = "userId") Long userId,
                                                           @PathVariable(name = "from")
                                                           @DateTimeFormat(pattern = "yyyy-MM-dd") Date from,
                                                           @PathVariable(name = "to")
                                                           @DateTimeFormat(pattern = "yyyy-MM-dd") Date to) {
        // TODO
        return null;
    }

    @GetMapping("/notborrowed")
    public List<Book> getAllBooksNotBorrowed() {
        // TODO
        return null;
    }
}
