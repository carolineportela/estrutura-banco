package com.richard.agregadorinvestimentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.richard.agregadorinvestimentos.entity.Users;
import com.richard.agregadorinvestimentos.service.UsersService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService userService) {
        this.usersService = userService;
    }

    //  lisar todos
    @GetMapping
    public ResponseEntity<List<Users>> listUsers() {
        var users = usersService.listUsers();

        return ResponseEntity.ok(users);
    }

    //  buscar um usuário pelo ID
    @GetMapping("/{userId}")
    public ResponseEntity<Users> getUserById(@PathVariable("userId") String userId) {
        Optional<Users> user = usersService.getUserById(userId);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
