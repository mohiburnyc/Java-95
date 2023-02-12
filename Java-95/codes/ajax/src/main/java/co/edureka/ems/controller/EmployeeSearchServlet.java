package co.edureka.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;

public class EmployeeSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");		
		service = (EmployeeService) context.getBean("employee-service");		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String empno = request.getParameter("eno");
		int eno = Integer.parseInt(empno);
		
		Employee emp = service.searchEmployeeByNo(eno);
		
		if(emp != null) {
			String ename = emp.getEmployeeName();
			float salary = emp.getEmployeeSal();
			
			response.setContentType("application/json");
			
			JSONObject obj = new JSONObject();
			obj.put("emp_name", ename);
			obj.put("emp_sal", salary);
			
			out.print(obj);
		}else {
			response.setContentType("text/plain");
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
