package com.imooc.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user) {
        return user;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable User user) {
        return user;
    }

    @GetMapping("/{id}")
    public User get(@PathVariable User user) {
        return user;
    }

    @GetMapping
    public List<User> create(String name) {
        return userRepository.findByName(name);
    }
}
