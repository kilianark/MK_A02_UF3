package com.iticbcn.ac02.Serveis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticbcn.ac02.DTO.StudentDTO;
import com.iticbcn.ac02.Mapper.StudentMapper;
import com.iticbcn.ac02.Models.Student;
import com.iticbcn.ac02.Repositoris.StudentRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServeiImpl implements StudentServei {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServeiImpl(StudentRepo studentRepo, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public Mono<Student> save(StudentDTO studentDTO) {
        return studentRepo.save(studentMapper.StudentDTOToStudent(studentDTO));
    }

    @Override
    public Mono<Student> findById(String id) {
        return studentRepo.findById(id);
    }

    @Override
    public Flux<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Mono<Student> update(StudentDTO studentDTO) {
        return studentRepo.findById(studentDTO.id())
            .map(std -> studentMapper.StudentDTOToStudent(studentDTO)).flatMap(studentRepo::save);
    }

    @Override
    public Mono<Void> delete(String id) {
        return studentRepo.deleteById(id);
    }
    
}
