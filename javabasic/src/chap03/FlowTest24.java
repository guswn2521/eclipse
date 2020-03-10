package chap03;

import java.util.Scanner;

public class FlowTest24 {

	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		int i=0;
//		while(i<=5) {
//			System.out.print(i);
//			i++;
//		}
		
		//1~50 까지 합
//		int sum = 0;
//		int i = 0;
//		while(true) {
//			sum += i;
//			i++;
//			System.out.println(sum);
//			if(i> 50) {
//				break;
//			}
//		}
		
		//단을 입력받아 해당 단 출력하기
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("%s * %s = %s%n", n, i, n*i);
//			i++;
//			
//		}
		//do-while문
//		int i = 0;
//		do {
//			System.out.println(i);
//			i+=  2;
//			if(i>=10) {
//				break;
//			}
//		}while(i>=1);
//		
		//컴퓨터가 낸 값 맞추기
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int)(Math.random()*100 +1);
		int i = 1;
		do {
			if(user == com) {
				System.out.println("맞혔습니다. 횟수 = "+i);
				i++;
				System.out.printf("com = %s, user = %s",com,user);
				break;
			}else if(user > com) {
				System.out.println("더 작은 수");
				user = sc.nextInt();
				i++;
				
			}else if(user < com) {
				System.out.println("더 큰 수");
				user = sc.nextInt();
				i++;
			}
			if(i>10) {
				System.out.printf("com = %s, user = %s",com,user);
				break;
			}
			
			System.out.println();
		}while(i<=10);
		
		
		
		

	}

}
