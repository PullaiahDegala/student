package com.mouritech.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.student.dto.StudentDto;
import com.mouritech.student.model.Student;
import com.mouritech.student.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
    @PostMapping("/creates")
    public ResponseEntity<?> createData(@RequestBody  @Valid     StudentDto studentDto)
    {
    	StudentDto response =studentService.createData(studentDto);
    	return new ResponseEntity<StudentDto>(response,HttpStatus.OK);  
    }
    
    
    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getBYId(@PathVariable Integer id)
    {
    	Student response= studentService.getById(id);
    	 
    	return new ResponseEntity<Student>(response,HttpStatus.OK);
    	

    
    
    }
    @GetMapping("add/{pageNum}/{pagesize}")
    
    public ResponseEntity<Object> pagination(@PathVariable Integer pageNum,@PathVariable Integer pagesize)
    {
    	Object response =studentService.createPage(pageNum,pagesize);
    	return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
}
