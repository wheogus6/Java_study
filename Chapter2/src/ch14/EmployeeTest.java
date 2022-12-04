package ch14;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employeeLee = new Employee();
		
		employeeLee.setEmployeeNameString("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		
		
	Employee employeeKim = new Employee();
	
	employeeKim.setEmployeeNameString("김유신");
	
	
	
	System.out.println(employeeLee.getEmployeeNameString() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
	System.out.println(employeeKim.getEmployeeNameString() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
	
	}

}
