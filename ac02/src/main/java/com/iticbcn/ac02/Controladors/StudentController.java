package com.iticbcn.ac02.Controladors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iticbcn.ac02.DTO.StudentDTO;
import com.iticbcn.ac02.Models.Student;
import com.iticbcn.ac02.Serveis.StudentServeiImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentServeiImpl studentServei;

    @Autowired
    public void setStudentServei(StudentServeiImpl studentServei) {
        this.studentServei = studentServei;
    }

    @PostMapping("/save")
    public Mono<Student> save(@RequestBody StudentDTO studentDTO) {
        return studentServei.save(studentDTO);
    }

    
    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable String id) {
        return studentServei.findById(id);
    }

    
    @GetMapping("/all")
    public Flux<Student> findAll() {
        return studentServei.findAll();
    }

    @PutMapping("/update")
    public Mono<Student> update(@RequestBody StudentDTO studentDTO) {
        return studentServei.update(studentDTO);
    }

  
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentServei.delete(id);
    }

}
