package co.edureka.ems.configs;

import co.edureka.ems.sevices.EmployeeService;
import co.edureka.ems.sevices.EmployeeServiceImpl;

public class EmployeeServicesFactory {
	private static EmployeeService empService= null;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(empService == null) {
			empService = new EmployeeServiceImpl();
		}
		return empService;
	}
}
