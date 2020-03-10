package test1;

public class Person {
	private int age;
	private String name;
	private String addr;
	
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void sleep() {
		System.out.println("보통 10시간");
	}
	public void showSleepStyle() {
		System.out.println("사람들 수면다양");
	}
}
