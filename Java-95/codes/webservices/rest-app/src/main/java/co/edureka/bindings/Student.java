package co.edureka.bindings;

import java.io.Serializable;

public class Student implements Serializable{
	private String studentName;
	private Integer studentAge;
	private String studentAddress;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public String getStudentAddress() {
		return studentAddress;
	}
	
}
