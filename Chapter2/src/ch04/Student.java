package ch04;

public class Student { //클래스 : 객체를 프로그래 하기위해 코드로 정의해 놓은 상태
	
	public int studentID;       //멤버 변수 : 클래스의 속성, 특성 ==> 객체가 만들어질 때 초기화 
	public String studentName;
	public String address;
	
	public void showStudentInfo() {   // 메서드 : 멤버변수를 이용하여 클래스의 기능을 구현한 함수
		System.out.println( studentID + "학번 학생 이름은 "  + studentName + " 이고, 주소는 "  + address + "입니다.");
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}
	
	
}
