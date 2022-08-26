package oops.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println(emp.getEmpId());
		
		emp.setEmpId(500);
		emp.setEmail("abc@gmail.com");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmail()); 
		
	}
}
