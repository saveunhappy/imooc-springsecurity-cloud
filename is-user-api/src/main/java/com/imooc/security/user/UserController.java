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
    JdbcTemplate jdbcTemplate;

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
    public List create(String name) {
        //http://localhost:8080/users?name= ' or 1 = 1 or name = '
        String sql = "SELECT id,name FROM user where name = '" + name + "'";
//        String sql = "SELECT id,name FROM user where name = '' or 1=1 or name= '';
        List data = jdbcTemplate.queryForList(sql);
        return data;
    }
}
