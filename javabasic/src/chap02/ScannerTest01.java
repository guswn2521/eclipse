package chap02;

import java.util.Scanner;

public class ScannerTest01 {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력해주세요>");
		
		Scanner sc = new Scanner(System.in);
		String sInput = sc.nextLine();
		int iInput = Integer.parseInt(sInput);
		
	
		System.out.println(sInput);

	}

}
