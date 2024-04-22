package com.mouritech.student.service;

import com.mouritech.student.dto.StudentDto;
import com.mouritech.student.model.Student;

public interface StudentService {

	StudentDto createData(StudentDto studentDto);

	Object createPage(Integer pageNum, Integer pagesize);

	Student getById(Integer id);

}
