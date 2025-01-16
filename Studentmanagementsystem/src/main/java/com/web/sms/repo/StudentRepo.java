package com.web.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{



}
