package ch06;

public class Student {
	
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	
	public String showStudentInfo() {
		
		return studentName + "학생의 이름은 " + studentNumber + "아고, "  + grade + "학년 입니다.";
	}
}
