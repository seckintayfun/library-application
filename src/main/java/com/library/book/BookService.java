package com.library.book;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookService {
    public List<Book> getAllBooksBorrowedByUserOnDateRange(Long userId, Date from, Date to) {
        // TODO
        return null;
    }

    public List<Book> getAllBooksNotBorrowed() {
        // TODO
        return null;
    }
}
