package com.cfs.BootP02.service;

import com.cfs.BootP02.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;


    public String getStudentData(){

        return repo.getStudentData();
    }
}
