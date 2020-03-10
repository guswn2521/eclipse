package chap06;

public class ExtendsTest2 {

	public static void main(String[] args) {
		Subsub ss = new Subsub();
		System.out.printf("%s,%s,%s%n", ss.x, ss.y, ss.z);
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();

	}

}
