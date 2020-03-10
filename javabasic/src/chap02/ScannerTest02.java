package chap02;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		
		System.out.println("국영수 점수 넣으세요>");
	
		
		// 대표메소드 nestLine, next, nextInt
		
		Scanner sc = new Scanner(System.in);
		
		int sKor = sc.nextInt();
		int sEng = sc.nextInt();
		int sMat = sc.nextInt();
		
		
		int total = sKor + sEng + sMat;
		
		System.out.println(sKor);
		System.out.println(sEng);
		System.out.println(sMat);
		System.out.println(total);
		
		

	}

}
