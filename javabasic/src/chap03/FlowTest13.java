package chap03;

import java.util.Scanner;

public class FlowTest13 {

	public static void main(String[] args) {
		
		//2씩 증가하며 50까지 합
		
//		int sum = 0;
//		for (int i = 0; i <= 50; i += 2) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		int sum = 0;
//		String exp = "";
//		
//		for (int i=0; i <=50; i +=2) {
//			sum += i;
//			exp += (i==0)? "" + i : "+" + i;
//		}
//		System.out.println(exp + "=" + sum);
		
		
		//50부터 1씩 감소하며 더하기
		
//		int sum = 0;
//		String exp = "";
//		for(int i=50; i>=0; i--) {
//			sum += i;
//			exp += (i==50)? "" + i : "+" +i;
//		}
//		System.out.println(exp + "=" + sum);
		
		
		//입력받은 수부터 1까지 합구하기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		for (int i = num; i >0; i--) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
