package test1;

public class Sawon2 {
	String name;
	String dept;
	int salary;
	
	public Sawon2(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	String displayInfo() {
		return "name : "+name+"dept :"+dept+"salary : "+salary;
	}
}

	class Sales2 extends Sawon2{
	int commition;
	
	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}
}
