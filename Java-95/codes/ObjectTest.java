class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Praveen";
		sal = 5000f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
}

class ObjectTest
{
	public static void main(String[] args) 
	{
		//create an instance of Employee
		Employee emp = new Employee();
		
		//access the state of object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//access the state of object using method
		emp.getDetails();

		//change the state of object using reference
		emp.empno = 101;
		emp.name = "Sachin";
		emp.sal = 2500f;
		emp.getDetails();

		//change the state of object using method
		emp.setDetails();
		emp.getDetails();
	}
}
