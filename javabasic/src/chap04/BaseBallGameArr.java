package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGameArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		System.out.println(com);
		int[] user = new int[3];
		int Strike=0, Ball=0, Out=0; //S, B, O
		boolean check = true; //비중복 
		int n = 0;
		//컴퓨터값 입력
		while(true) {
			for(int i=0;i<3;i++) {
				com[i] = (int)(Math.random()*9)+1;
			}
			check = isCheck(com);
			if(check) {
				break;
			}
		}
		//System.out.println(Arrays.toString(com));
		//게임시작
		while(true) {
			Strike = 0; Ball = 0; Out = 0;
			for(int i=0;i<3;i++) {
				user[i] = sc.nextInt();
			}
			check = isCheck(user);
			if(!check) {
				System.out.println("중복값 넣지마세요.");
				continue;
			}
			n++;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if (com[i] == user[j]) {
						if(i==j) Strike++;
						else Ball++;
					}
				}
			}
			Out = 3 - Strike - Ball;
			
			System.out.printf("%sS %sB %sO%n",Strike,Ball, Out);
			if(Strike == 3) {
				System.out.printf("빙고! %s회 시도",n);
				break;
			}
		}
	}
	//중복값 처리 메서드
	// true : 중복안됨, false : 중복 
	static boolean isCheck(int[] n) {
		System.out.println(n);
		boolean check = false;
		if(n[0]!=n[1] && n[0]!=n[2] && n[1]!=n[2]) {
			check = true;
		}
		return check;
	}
}
