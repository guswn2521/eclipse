package chap06;

public class OverridingParent2 {
	int money = 20;
	
	//기본생성자
	public OverridingParent2() {
		// TODO Auto-generated constructor stub
	}
	
	//오버로딩된 생성자
	public OverridingParent2(int money) {
		this.money = 70;
	}
	
	
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild2 extends OverridingParent2{
	//String money = "20원";
	int money = 80;
	
	public OverridingChild2() {  //생성자
		super(100);
	}
	
	@Override
	void parentMethod() {
		super.parentMethod();
		System.out.println("child overriding method");
	}
}
