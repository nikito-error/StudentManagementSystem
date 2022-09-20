package com.sms.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{//jpa repository have implementtaitio of @Repo anotation

}
