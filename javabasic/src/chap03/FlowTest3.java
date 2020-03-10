package chap03;

import java.util.Scanner;

public class FlowTest3 {

	public static void main(String[] args) {
		
		System.out.println("연도를 입력하시오");
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		boolean c1 = y % 400 == 0;
		boolean c2 = y % 4 ==0;
		boolean c3 = y % 100 != 0;
		
		if (c1 || (c2 && c3)) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년아님");
		}
		
//		if (y % 4 == 0) {
//			if (y % 400 == 0 || y % 100 !=0) {
//				System.out.println("윤년");
//			}
//			else {
//				System.out.println("윤년아님");
//			}
//		}else {
//			System.out.println("윤년아님");
//		}

	}

}
//틀린거
//int y = 2104;
//if (y % 4 == 0) {
//	if (y % 400 == 0) {
//		System.out.println("윤년");
//	}
//	else if (y % 100 != 0) {
//		System.out.println("윤년");
//	}else {
//		System.out.println("윤년아님");
//	}
//}else {
//	System.out.println("윤년아님");
//}