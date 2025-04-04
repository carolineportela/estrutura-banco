package com.richard.agregadorinvestimentos.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//classe
import com.richard.agregadorinvestimentos.entities.Users;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
