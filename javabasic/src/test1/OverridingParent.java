package test1;

public class OverridingParent {
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent{
	void parentMethod() {
		System.out.println("overriding method");
	}
}
