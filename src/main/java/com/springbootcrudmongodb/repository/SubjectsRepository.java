package com.springbootcrudmongodb.repository;

import com.springbootcrudmongodb.model.Subjects;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends MongoRepository<Subjects, String> {

}
