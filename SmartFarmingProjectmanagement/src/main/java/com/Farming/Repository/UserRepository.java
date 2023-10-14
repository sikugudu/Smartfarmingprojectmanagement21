package com.Farming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
