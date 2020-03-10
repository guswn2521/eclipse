package chap03;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		/*
		 * 사칙연산
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자, 기호, 숫자 : ");
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		int n1 = Integer.parseInt(a);
		int n3 = Integer.parseInt(c);
		
		
		float result = 0 ;
		
		if (b.equals("+")) {
			result = n1 + n3;
		}else if(b.equals("-")) {
			result = n1 - n3;
		}else if (b.equals("*")) {
			result = n1 * n3;
		}else if (b.equals("/")) {
			result = n1 / (float)n3;   //(float)붙여야 나누기 소수점 나옴
		}
		System.out.printf("%s%s%s = %s%n", n1, b, n3,result);
		//String 형에서 '==' 대신 .equals()

	}

}
