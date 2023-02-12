package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.bindings.Student;

@Path("/edureka")
public class StudentRegistrationRestController {
	/*
	@POST
	@Path("/register")
	@Produces("text/html")
	public String registerStudent(@FormParam("name_field") String studentName, @FormParam("age_field") Integer studentAge,
								  @FormParam("addr_field") String studentAddress) {
		//--logic to save the student to database
		String response = "<p style=font-size:25px;line-height:2;color:blue>";
		response += "Name - "+studentName+"<br>";
		response += "Age - "+studentAge+"<br>";
		response += "Address - "+studentAddress+"</p>";
		
		return response;
	}
	*/
	
	@POST
	@Path("/register")
	@Produces("application/json")
	public Student registerStudent(@FormParam("name_field") String studentName, @FormParam("age_field") Integer studentAge,
								  @FormParam("addr_field") String studentAddress) {
		//--logic to save the student to database
		Student st = new Student();
		st.setStudentName(studentName);
		st.setStudentAge(studentAge);
		st.setStudentAddress(studentAddress);
		
		return st;
	}	
}
