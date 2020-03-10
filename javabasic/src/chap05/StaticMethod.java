package chap05;

public class StaticMethod {
	int memVar; //인스턴스변수
	static int staticVar; //스태이틱변수
	
	void memMethod1() {  //인스턴스메소드
		int local = memVar;  //지역변수
		local = staticVar;
		
	}
	void memMethod2() {
		System.out.println("memMethod2");
	}
	
	static void staticMethod1() {
		//int local = memVar;
		//memMethod1();
		StaticMethod st = new StaticMethod();
		int local = st.memVar;
		st.memMethod1();
		st.memMethod2();
		System.out.println("staticMethod1");
	}
	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	
	public static void main(String[] args) {
		//StaticMethod.memMethod1();
		StaticMethod st = new StaticMethod();
		st.memMethod1();
		StaticMethod.staticMethod2();
		staticMethod2();
		int local = staticVar;
		//local = memVar;
		
	}
	
}
