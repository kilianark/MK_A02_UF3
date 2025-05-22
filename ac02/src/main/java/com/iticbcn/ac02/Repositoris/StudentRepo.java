package com.iticbcn.ac02.Repositoris;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.iticbcn.ac02.Models.Student;

import reactor.core.publisher.Flux;

@Repository
@EnableReactiveMongoRepositories
public interface StudentRepo extends ReactiveMongoRepository<Student, String> {
    
    @Query("{ 'lastname1': { $regex: ?0, $options: 'i' } }")
    Flux<Student> findByLastnameMatchingRegex(String regex);

}
