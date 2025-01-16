package com.web.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.sms.entity.Student;
import com.web.sms.repo.StudentRepo;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
    @Autowired
    private StudentRepo studentrepository;
	@Override
	public void run(String... args) throws Exception {
		
		Student student1=new Student("Ramesh","Fadatare","ramesh@gmail.com");
		studentrepository.save(student1);
		
		Student student2=new Student("SAnju","jadav","sanjayjd@gmail.com");
		studentrepository.save(student2);
		
		Student student3=new Student("Subham","Beura","sybhambeura@gmail.com");
		studentrepository.save(student3);
		
		
		
	}

}
