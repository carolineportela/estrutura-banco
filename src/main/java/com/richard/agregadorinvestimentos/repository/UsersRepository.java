package com.richard.agregadorinvestimentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//classe
import com.richard.agregadorinvestimentos.entity.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
