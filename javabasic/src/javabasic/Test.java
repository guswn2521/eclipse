package javabasic;

public class Test {
//	public int sum(int a, int b) {
//		return a+b;
//	}
//	public static void main(String[] args) {
//		int a = 3;
//		int b=4;
//		Test myTest = new Test();
//		int c = myTest.sum(a, b);
//		
//		System.out.println(c);
//	}
	
//	public int vartest(int a) {
//		a++;
//		return a;
//	}
//	public static void main(String[] args) {
//		int a = 1;
//		Test myTest = new Test();
//		a = myTest.vartest(a);
//		System.out.println(a);
//	}
	  
//	int a =1;
//	public void vartest(Test test) {
//		test.a++;
//	}
//	public static void main(String[] args) {
//		Test myTest = new Test();
//		myTest.a = 1;
//		myTest.vartest(myTest);
//		System.out.println(myTest.a);
//	}
	
	int a;
	int b;
	public void vartest() {
		this.a ++;
		this.b --;
	}
	public static void main(String[] args) {
		Test myTest = new Test();
		myTest.a = 1;
		myTest.b = 3;
		myTest.vartest();
		System.out.println(myTest.a);
		System.out.println(myTest.b);
	}

}

