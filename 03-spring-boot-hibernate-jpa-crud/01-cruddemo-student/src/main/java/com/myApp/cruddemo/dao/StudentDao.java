package com.myApp.cruddemo.dao;

import com.myApp.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student student);
    void delete(Integer id);
    int deleteAll();

}
