package com.richard.agregadorinvestimentos.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import com.richard.agregadorinvestimentos.controller.CreateUserDto;
//import com.richard.agregadorinvestimentos.controller.UpdateUsersDto;
import com.richard.agregadorinvestimentos.entity.Users;
import com.richard.agregadorinvestimentos.repository.UsersRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> listUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(String userId) {
        return usersRepository.findById(Long.parseLong(userId));
    }



}




