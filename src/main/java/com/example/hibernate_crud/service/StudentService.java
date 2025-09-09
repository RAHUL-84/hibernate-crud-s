package com.example.hibernate_crud.service;

import com.example.hibernate_crud.entity.Student;
import com.example.hibernate_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findOne(id);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = repository.findOne(id);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            return repository.save(student);
        }
        return null;
    }

    public String deleteStudent(Long id){
        repository.delete(id);
        return "Student deleted successfully";
    }
}
