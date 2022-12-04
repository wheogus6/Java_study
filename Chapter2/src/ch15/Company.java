package ch15;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if( instance == null) {
			instance = new Company();
		}
	
		return instance;
	}//스테틱 메서드 = 멤버변수(인스턴스) 없이 호출 가능 
}
