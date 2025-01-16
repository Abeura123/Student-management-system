package com.web.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.sms.entity.Student;
import com.web.sms.repo.StudentRepo;
import com.web.sms.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
private StudentRepo studentRepository;  

	


	public StudentServiceimpl(StudentRepo studentRepository) {
	super();
	this.studentRepository = studentRepository;
}

@Override
public List<Student> getAllStudents(){
	return studentRepository.findAll();	
}


@Override
public Student updateStudent(Student student){
	return studentRepository.save(student);
	
}
@Override
public void deleteStudentById(Long id) {
	studentRepository.deleteById(id);	
}

@Override
public Student saveStudent(Student student) {
	// TODO Auto-generated method stub
	return studentRepository.save(student);
}

@Override
public Student getStudentById(Long id) {
	// TODO Auto-generated method stub
	return studentRepository.findById(id).get();
}




}
