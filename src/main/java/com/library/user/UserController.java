package com.library.user;

import org.springframework.beans.factory.annotation.Autowired;
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
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/borrowed")
    public List<User> getAllUsersBorrowedBook() {
        return this.userService.getAllUsersBorrowedBook();
    }

    @GetMapping("/notborrowed")
    public List<User> getAllNonTerminatedUsersNotBorrowedBook() {
        return this.userService.getAllNonTerminatedUsersNotBorrowedBook();
    }

    @GetMapping("/borrowed/{date}")
    public List<User> getAllUsersBorrowedBookOnDate(@PathVariable(name = "date")
                                                    @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return this.userService.getAllUsersBorrowedBookOnDate(date);
    }
}
