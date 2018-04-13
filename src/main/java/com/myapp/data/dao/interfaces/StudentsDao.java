package com.myapp.data.dao.interfaces;

import com.myapp.data.entities.Student;
import java.util.List;

public interface StudentsDao {

    Student addStudent(Student student);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
    Student getStudentByPIB(String pib);
    List<Student> getAllStudentsByCourse(int course);
    void saveStudent(Student student);

}
