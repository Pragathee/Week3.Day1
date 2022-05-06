package week3.day1;

public class Automation implements Language, TestTool {
	private int no;
	private String Name;

	public void java() {
		System.out.println("Learn Java");
	}

	public void selenium() {
		System.out.println("Learn Selenium");
	}

	public String getName(String Name) {
		return Name;
	}

	public Automation(String Name, int num) {
		this.Name = Name;
		this.no = num;
		System.out.println("Name is" + Name + "and the num is"    + num);
	}

	public static void main(String[] args) {
		Automation obj = new Automation("Testleaf", 012);
		obj.java();
		obj.selenium();
		System.out.println("Id is " + id);
	}
}
