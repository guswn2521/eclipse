package chap02;

public class OperatorTest04 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a; // 앞에서 오버플로우 발생
		int result2 = a / a * a; // == 1 * a
		
		System.out.printf("%s * %s / %s = %s%n", a, a, a, result1);
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
		
		float pi = 3.141592f;
		float tmp = pi * 10000;
		int iTmp = (int)tmp + 5;
		float shortPi = iTmp / 10000f;
		
		float rs = (int)((pi + 0.0005) * 1000) / 1000f;  //반올림
		
		System.out.println(rs);
		
		
	

				
	}

}
