package com.library.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    String queryForFindingUsersBorrowedBook = "SELECT U.* FROM user U INNER JOIN borrowed B ON B.borrower = CONCAT(U.last_name, ',', U.first_name) ";

    @Query(value = queryForFindingUsersBorrowedBook + "GROUP BY U.id HAVING COUNT(*) > 0", nativeQuery = true)
    List<User> getAllUsersBorrowedBook();

    @Query(value = queryForFindingUsersBorrowedBook + "AND U.member_till IS NULL GROUP BY U.id HAVING COUNT(*) = 0", nativeQuery = true)
    List<User> getAllNonTerminatedUsersNotBorrowedBook();

    @Query(value = queryForFindingUsersBorrowedBook + "AND B.borrowed_from = ?1 GROUP BY U.id", nativeQuery = true)
    List<User> getAllUsersBorrowedBookOnDate(Date date);
}
