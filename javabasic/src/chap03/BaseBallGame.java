package chap03;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com1 = 0, com2 = 0, com3 =0;
		int user1 = 0, user2 = 0, user3 = 0; //Scanner
		int Strike=0, Ball=0, Out=0; //S, B, O
		boolean check = true; //비중복 
		while(true) {
			com1 = (int)(Math.random()*9)+1; 
			com2 = (int)(Math.random()*9)+1; 
			com3 = (int)(Math.random()*9+1);
			
			check = isCheck(com1, com2, com3);
			if(check) {
				break;
			}
		}
		System.out.printf("%s%s%s%n",com1,com2,com3);
		
		while(true) {
			Strike = 0; 
			Ball = 0; 
			Out = 0;
			System.out.println("첫번째 숫자를 넣으세요.(1~9)");
			user1 = sc.nextInt();
			System.out.println("두번째 숫자를 넣으세요.(1~9)");
			user2 = sc.nextInt();
			System.out.println("세번째 숫자를 넣으세요.(1~9)");
			user3 = sc.nextInt();
			
			check = isCheck(user1, user2, user3);
			if(!check) {
				System.out.println("중복값 넣지마세요.");
				continue;
			}
			
			if(com1 == user1) {
				Strike++;
			}else if(com1 == user2) {
				Ball++;
			}else if(com1 == user3) {
				Ball++;
			}
				
			if(com2 == user1) {
				Ball++;
			}else if(com2 == user2) {
				Strike++;
			}else if(com2 == user3) {
				Ball++;
			}
			
			if(com3 == user3) {
				Strike++;
			}else if(com1 == user2) {
				Ball++;
			}else if(com1 == user1) {
				Ball++;
			}
			Out = 3 - Strike - Ball;
			
			System.out.printf("%sS %sB %sO%n",Strike,Ball, Out);
			if(Strike == 3) {
				System.out.println("빙고!");
				break;
			}
			
		}
		
		
	}
	
	//중복값 처리 메서드
	// true : 중복안됨, false : 중복 
	static boolean isCheck(int n1, int n2, int n3) {
		boolean check = false;
		if(n1!=n2 && n1!=n3 && n2!=n3) {
			check = true;
		}
		return check;
	}
}
