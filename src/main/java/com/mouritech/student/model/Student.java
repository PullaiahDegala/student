package com.mouritech.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


//------It is a student project-------------------//
@Entity
@Table(name ="studentsdetails")
public class Student {
	
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Integer Id;
	
	@NotBlank(message = "name should be not blank")
	@Size(min = 2,max = 10 ,message = "name should not above 10")
	@Column(name ="student_name",nullable = false)
	private String studentName;

	@NotEmpty(message = "phone number should be not empty")
	@Pattern(regexp = "\\d{10}",message = "number not should be above 10")
	@Column(name ="student_phoneNumber",nullable = false)
	private String studentPhoneNumber;
	@NotBlank(message = "email should be not blank")
	@Email(message = "email should be valid")
	@Column(name ="student_email",nullable = false)
	private String studentEmail;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public Student(Integer id, String studentName, String studentPhoneNumber, String studentEmail) {
		super();
		Id = id;
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentEmail = studentEmail;
	}
	public Student() {
		super();
	}
	
	
	

}
