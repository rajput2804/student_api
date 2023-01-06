package com.example.student_api.StudentServices;
import com.example.student_api.DaoLayer.StudentRepository;
import com.example.student_api.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Students> getStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Optional<Students> getStudentById(long studentId) {
        return this.studentRepository.findById(studentId);
    }

    @Override
    public Students addStudent(Students students) {
        studentRepository.save(students);
        return students;
    }

    @Override
    public void deleteStudent(long parseLong) {
        Students entity= studentRepository.getOne(parseLong);
        studentRepository.delete(entity);

    }

    @Override
    public Students updateStudent(Students student) {
        studentRepository.save(student);
        return student;
    }




}