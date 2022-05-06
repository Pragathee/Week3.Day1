package week3.day1;

public class Student {
public void StudentName() {
	System.out.println("Pragathi");
}
public void StudentId() {
	System.out.println("Id is 123");
}
public static void main (String []args) {
	College college =new College();
	Department department =new Department();
	Student student =new Student();
	college.collegeName();
	college.collegeCode();
	college.collegedist();
	department.deptName();
	student.StudentName();
	student.StudentId();
	
}
}
