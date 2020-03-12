package chap08;

public class EqualsTest1 {

	public static void main(String[] args) {
		Student3 st1 = new Student3("오정원",1);
		Student3 st2 = new Student3("오정원",1);
		
//		System.out.println(st1 == st2);
//		System.out.println(st1.equals(st2));
		Student4 st3 = new Student4("홍길동",1);
		Student4 st4 = new Student4("홍길동",1);
		System.out.println(st3.equals(st4));
		System.out.println(st3 == st4);

	}

}
