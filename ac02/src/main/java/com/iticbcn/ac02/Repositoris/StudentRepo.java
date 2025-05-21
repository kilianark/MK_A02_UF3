package com.iticbcn.ac02.Repositoris;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.iticbcn.ac02.Models.Student;

@Repository
@EnableReactiveMongoRepositories
public interface StudentRepo extends ReactiveMongoRepository<Student, String> {

}
