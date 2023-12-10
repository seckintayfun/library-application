package com.library.user;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/borrowed")
    public List<User> getAllUsersBorrowedBook() {
        // TODO
        return null;
    }

    @GetMapping("/notborrowed")
    public List<User> getAllNonTerminatedUsersNotBorrowedBook() {
        // TODO
        return null;
    }

    @GetMapping("/borrowed/{date}")
    public List<User> getAllUsersBorrowedBookOnDate(@PathVariable(name = "date")
                                                    @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        // TODO
        return null;
    }
}
