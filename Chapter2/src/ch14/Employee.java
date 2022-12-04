package ch14;

public class Employee {
		
	private static int serialNum = 1000;
	 //스테틱 변수(클래스 변수)
	private int employeeId;
	private String employeeNameString; //인스턴스 변수 (일반 멤버 변수)
	private String dpartmentString;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}
	
	
	
	
	public static int getSerialNum() {
		int i = 0;
		
//인스턴스변수 스테틱에서 사용불가 		employeeNameString = "Lee";
		
		return serialNum;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNameString() {
		return employeeNameString;
	}
	public void setEmployeeNameString(String employeeNameString) {
		this.employeeNameString = employeeNameString;
	}
	public String getDpartmentString() {
		return dpartmentString;
	}
	public void setDpartmentString(String dpartmentString) {
		this.dpartmentString = dpartmentString;
	}
	
	
	
}
