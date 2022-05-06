package week3.day1;

public class StudentInfo {
	public int getStudentInfo(int id) {
		return id;

	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);

	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("email is "+email);
		System.out.println("phonenumber is "+phonenumber);

	}
	public static void main(String[]args) {
		StudentInfo stu =new StudentInfo();
		int Student=stu.getStudentInfo(1);
		stu.getStudentInfo(147,"Pragathi");
		stu.getStudentInfo("pragathi123@gmail.com",123456789);

	}
}

