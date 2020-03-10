package chap03;

import java.util.Scanner;

public class FlowTest14 {
	
//단을 입력받아 구구단 출력하기
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String sInput = sc.next();
//		int dan = Integer.parseInt(sInput);
//		String pt = "";
//		
//		for (int i=1; i <=9; i++) {
//			pt = "%s * %s = %s%n";
//			System.out.printf(pt,dan, i,  dan * i);
//		}
//		int sum = 0;
//		for(int i =0; i <=50;i++) {
//			if (i %2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		//조건식을 만족하면 반복문을 빠져나감.
		int sum = 0;
		for (int i=2; i%2 ==0;i++) {
			if(i <=50) {
				sum += i;
				System.out.println(i);
			}
			System.out.println(sum);
		}
		

	}

}
