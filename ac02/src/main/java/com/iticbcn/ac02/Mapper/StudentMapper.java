package com.iticbcn.ac02.Mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.iticbcn.ac02.DTO.StudentDTO;
import com.iticbcn.ac02.Models.Student;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StudentMapper {
    StudentDTO StudentsToStudentsDTO(Student student);

    Student StudentDTOToStudent(StudentDTO studentDTO);

    Set<StudentDTO> StudentsToStudentsDTO(Set<Student> students);
    Set<Student> StudentsDTOToStudents(Set<StudentDTO> studentsDTO);
}
