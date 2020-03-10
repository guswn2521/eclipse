package chap06;

public class Employee extends Person{
	private String department;
	int x = 20;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartmetn(String department) {
		this.department = department;
		
	}
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("직장인은 일반적으로 7시간을 잔다.");
	}
	
	@Override
	public void showSleepStyle() {
		super.showSleepStyle();
		System.out.println("직장인은 일에 쫓겨 수면이 부족하다.");
	}
}
