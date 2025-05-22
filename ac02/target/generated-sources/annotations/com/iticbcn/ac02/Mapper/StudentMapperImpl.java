package com.iticbcn.ac02.Mapper;

import com.iticbcn.ac02.DTO.StudentDTO;
import com.iticbcn.ac02.Models.Student;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-22T17:15:13+0200",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO StudentsToStudentsDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        String id = null;
        String name = null;
        String lastname1 = null;
        String lastname2 = null;
        String gender = null;
        String email = null;
        String phone = null;
        int birth_year = 0;

        id = student.getId();
        name = student.getName();
        lastname1 = student.getLastname1();
        lastname2 = student.getLastname2();
        gender = student.getGender();
        email = student.getEmail();
        phone = student.getPhone();
        birth_year = student.getBirth_year();

        StudentDTO studentDTO = new StudentDTO( id, name, lastname1, lastname2, gender, email, phone, birth_year );

        return studentDTO;
    }

    @Override
    public Student StudentDTOToStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student.StudentBuilder student = Student.builder();

        student.birth_year( studentDTO.birth_year() );
        student.email( studentDTO.email() );
        student.gender( studentDTO.gender() );
        student.id( studentDTO.id() );
        student.lastname1( studentDTO.lastname1() );
        student.lastname2( studentDTO.lastname2() );
        student.name( studentDTO.name() );
        student.phone( studentDTO.phone() );

        return student.build();
    }

    @Override
    public Set<StudentDTO> StudentsToStudentsDTO(Set<Student> students) {
        if ( students == null ) {
            return null;
        }

        Set<StudentDTO> set = new LinkedHashSet<StudentDTO>( Math.max( (int) ( students.size() / .75f ) + 1, 16 ) );
        for ( Student student : students ) {
            set.add( StudentsToStudentsDTO( student ) );
        }

        return set;
    }

    @Override
    public Set<Student> StudentsDTOToStudents(Set<StudentDTO> studentsDTO) {
        if ( studentsDTO == null ) {
            return null;
        }

        Set<Student> set = new LinkedHashSet<Student>( Math.max( (int) ( studentsDTO.size() / .75f ) + 1, 16 ) );
        for ( StudentDTO studentDTO : studentsDTO ) {
            set.add( StudentDTOToStudent( studentDTO ) );
        }

        return set;
    }
}
