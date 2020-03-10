package chap02;

import java.util.Scanner;

public class OperationTest12 {

	public static void main(String[] args) {
		
//		int num = 333;
//		
//		int rs = (num / 10) *10 ;
//		int rs1 = rs + 1;
//		System.out.println(rs1);
		
		
//		String num = args[0];
//		int n = args.length;
//		int h = Math.power(10,n-1);
//		int x = h * (num / h);
		
		// C(섭씨) = 5/9 x (F-32)
		//소수점  3자리에서 반올림 한 값 구하기
		
		Scanner sc = new Scanner(System.in);
//		double f = sc.nextFloat();
//		double c = (5/9.0)*(f-32); //(f - 32) * 5 / 9; 
//		System.out.println(c);
//		double rs = Math.round(c * 100);
//		double result = rs / 100;
//		System.out.println(result);
//		
		
		//변수의 값에 따라 0 양수, 음수 출력하는 코드
		
		int num = sc.nextInt();
		String rs = num == 0 ? "영" : num > 0 ? "양수" : "음수" ;
		System.out.println(rs);
		
		

	}

}
