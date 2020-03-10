package chap06;

public class OverridingParent {
	void parentMethod() {
		
		System.out.println("parent method");
	}
}
class OverridingChild extends OverridingParent{
	@Override
	void parentMethod() {
		System.out.println("overriding method");
	}
}