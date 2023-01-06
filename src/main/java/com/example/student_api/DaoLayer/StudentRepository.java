package com.example.student_api.DaoLayer;

import com.example.student_api.entity.Students;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface StudentRepository extends JpaRepository<Students,Long> {
//    @Query("SELECT s FROM students WHERE student_name=:n")
//   public Students findByStudentName( @Param("n") String studentName);
}
