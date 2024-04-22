package com.mouritech.student.dto;

public class StudentDto {
	
	
	private Integer Id;
	private String studentName;
	private String studentPhoneNumber;
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
	public StudentDto(Integer id, String studentName, String studentPhoneNumber, String studentEmail) {
		super();
		Id = id;
		this.studentName = studentName;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentEmail = studentEmail;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
