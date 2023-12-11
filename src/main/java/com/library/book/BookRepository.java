package com.library.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // TODO -- Write queries to extract intended data.
    // @Query(value = "", nativeQuery = true)
    // List<Book> getAllBooksBorrowedByUserOnDateRange(Long userId, Date from, Date to);

    // @Query(value = "", nativeQuery = true)
    // List<Book> getAllBooksNotBorrowed();
}
