package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.collections.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
    
}
