package com.example.student_api.StudentServices;

import com.example.student_api.entity.Students;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Students> getStudents();

   public Optional<Students> getStudentById(long studentId);

   public Students addStudent(Students students);

   public void deleteStudent(long parseLong);

   public Students updateStudent(Students student);


//    public List<Students> getByName(String studentName);
}