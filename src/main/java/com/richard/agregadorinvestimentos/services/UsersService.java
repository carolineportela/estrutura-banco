package com.richard.agregadorinvestimentos.services;

import org.springframework.stereotype.Service;
//import com.richard.agregadorinvestimentos.controller.CreateUserDto;
//import com.richard.agregadorinvestimentos.controller.UpdateUsersDto;
import com.richard.agregadorinvestimentos.entities.Users;
import com.richard.agregadorinvestimentos.repositories.user.UsersRepository;

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




