package com.example.workshop.springboot.repository;

import com.example.workshop.springboot.model.UserModel;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
// Marcos Prado
public interface UserRepository extends CrudRepository<UserModel, Integer>  {  
    Iterable<UserModel> findByName(String name);
}