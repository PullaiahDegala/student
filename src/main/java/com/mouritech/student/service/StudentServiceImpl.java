package com.mouritech.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mouritech.student.dao.StudentRepository;
import com.mouritech.student.dto.StudentDto;
import com.mouritech.student.exception.StudentIdNotFound;
import com.mouritech.student.model.Student;

@Service
public class StudentServiceImpl  implements StudentService{
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentDto createData(StudentDto studentDto) {
		
		
		Student response =MappingDtoToEntity(studentDto);
		Student student =studentRepository.save(response);
		StudentDto studentDto1 =MappingEntityToDto(student);
		return studentDto1;
	}

	private StudentDto MappingEntityToDto(Student student) {
		StudentDto res=new StudentDto();
		res.setId(student.getId());
		res.setStudentName(student.getStudentName());
		res.setStudentPhoneNumber(student.getStudentPhoneNumber());
		res.setStudentEmail(student.getStudentEmail());
		return res;
	}

	private Student MappingDtoToEntity(StudentDto studentDto) {
		
		Student response =new Student();
		response.setId(studentDto.getId());
		response.setStudentName(studentDto.getStudentName());
		response.setStudentPhoneNumber(studentDto.getStudentPhoneNumber());
		response.setStudentEmail(studentDto.getStudentEmail());
		return response;
	}

	@Override
	public Object createPage(Integer pageNum, Integer pagesize) {
		Pageable res=PageRequest.of(pageNum, pagesize, Sort.by("studentName"));
		return studentRepository.findAll(res);
	}

	@Override
	public Student getById(Integer id) {
		if(studentRepository.findById(id).isEmpty())
		{
			throw new StudentIdNotFound("Id is not found in the database ! please add id");
		}
		Optional<Student> res= studentRepository.findById(id);
		if(res.isPresent())
		{
			Student rese=res.get();
			return rese;
			
		}
		return null;
	}

}
