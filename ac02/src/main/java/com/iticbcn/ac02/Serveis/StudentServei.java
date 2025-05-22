package com.iticbcn.ac02.Serveis;

import com.iticbcn.ac02.DTO.StudentDTO;
import com.iticbcn.ac02.Models.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentServei {
    Mono<Student> save(StudentDTO studentDTO);
    Mono<Student> findById(String id);
    Flux<Student> findAll();
    Mono<Student> update(StudentDTO studentDTO);
    Mono<Void> delete(String id);
    Flux<Student> findByLastnameMatchingRegex(String regex);

}
