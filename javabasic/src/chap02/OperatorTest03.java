package chap02;

public class OperatorTest03 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;  // 오버플로우 발생
		long b = 1000000 * 1000000L;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);

	}

}
