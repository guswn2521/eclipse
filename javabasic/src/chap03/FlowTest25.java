package chap03;

import java.util.Scanner;

public class FlowTest25 {

	public static void main(String[] args) {
	
		for(int i=1;i<=10;i++) {
			
			if(i>5) {
				continue;
			}
			System.out.println(i);
		}
		
		//정수 입력받아서 각 자리합 출력하기
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = n%10;
//		int j = n / 10;
//		int sum = 0;
//		
//		while (j !=0) {
//			sum +=i;
//			i = j % 10;
//			j =  j / 10;
//		}
//		System.out.println(sum + i);
		
		
		//정수 입력받아서 문자열 -> 자리합 구하기
//		String s = n + "";
//		String s1 = "";
//		int k = s.length();
//		
//		for(int h=0;h<k;h++) {
//			s1 = s.charAt(h)+"";
//			sum += Integer.parseInt(s1);
//		}
//		System.out.println(sum);

	}

}
