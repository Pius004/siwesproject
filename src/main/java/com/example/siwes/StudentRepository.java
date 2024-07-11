package com.example.siwes;

import com.example.siwes.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {

}
