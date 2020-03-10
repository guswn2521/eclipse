package chap06;

public class Sawon {
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}

class Sales extends Sawon{
	int commition;
	
	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;
	}
}


