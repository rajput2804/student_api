package com.example.student_api.controller;

import com.example.student_api.StudentServices.StudentService;
import com.example.student_api.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/home")
    public String home(){
        String text= "this is private page ";
        text+="this page is not allowed to unauthorised users";
        return text;
    }
//    get the list of all student
    @GetMapping("/students")
    public ResponseEntity<List<Students>> getCourses(){

        List<Students> list=studentService.getStudents();
        if (list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
//    search the student by studentId
    @GetMapping("/students/{studentId}")
    public  ResponseEntity<Optional<Students>> getStudentById(@PathVariable String studentId){
        Optional<Students> optional=studentService.getStudentById(Long.parseLong(studentId));
        if (optional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(optional));

    }
//    add new student
    @PostMapping("/students")
    public ResponseEntity<Students> addStudent(@RequestBody Students students){
       try{ Students student=studentService.addStudent(students);
        return  ResponseEntity.status(HttpStatus.ACCEPTED).build();
       }
       catch(Exception exeption){
           return new ResponseEntity<>(students, HttpStatus.INTERNAL_SERVER_ERROR);
       }

    }
    @PutMapping("/students")
    public Students updateStudent(@RequestBody Students student){
        return this.studentService.updateStudent(student);
    }
    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<Students> deleteStudent(@PathVariable String studentId){
        try {
            this.studentService.deleteStudent(Long.parseLong(studentId));
            return  new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    custom methods to get more enhanced result
//    @GetMapping("/students/{student_name}")
//    public List<Students> getByName(@PathVariable String studentName){
//         return this.studentService.getBYName(studentName);


//    }

}
