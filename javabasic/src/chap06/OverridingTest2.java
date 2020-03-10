package chap06;

public class OverridingTest2 {

	public static void main(String[] args) {
		OverridingParent2 op = new OverridingParent2(100);
		OverridingChild2 oc2 = new OverridingChild2();
		//oc2.money = "30원";
		//oc2.money = 30;
		System.out.println("oc2.money = " + oc2.money);
		System.out.println(op.money);
		oc2.parentMethod();
		op.parentMethod();

	}

}
