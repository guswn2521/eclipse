package chap06;

public class Sawon2 {
	String name;
	String dept;
	int salary;
	
	public Sawon2(String name, String dept, int salary) {
		//super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	String displayInfo() {
		return "이름 : " + name + ",부서 : " + dept + ",연봉 : "+ salary;
	}
}

class Sales2 extends Sawon2{
	int commition;
	
	public Sales2(String name, String dept, int salary, int commition) {
		super(name, dept, salary);
		this.commition = commition;
	}
	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;
	}
}
