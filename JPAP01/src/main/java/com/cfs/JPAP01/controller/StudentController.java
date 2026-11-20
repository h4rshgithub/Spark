package com.cfs.JPAP01.controller;


import com.cfs.JPAP01.entity.Student;
import com.cfs.JPAP01.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private  final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo){

        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id , @RequestBody Student student){
        Student s = studentRepo.findById(id).orElseThrow();
        s.setName(student.getName());
        s.setEmail(student.getEmail());
       return  studentRepo.save(s);

    }

    @PatchMapping
    public Student updateName(@RequestParam Long id , @RequestParam String name){
        Student s = studentRepo.findById(id).orElseThrow();
        s.setName(name);
        return studentRepo.save(s);
    }





}
