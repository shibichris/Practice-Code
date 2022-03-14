package com.example.demo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Model;

public interface BookRepository extends MongoRepository<Model, Integer> {

}
