package chap03;

import java.util.Scanner;

public class FlowTest5 {

	public static void main(String[] args) {
		
		System.out.println("과목 점수 입력:");
		
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int mat = sc.nextInt();
		int eng = sc.nextInt();
		
		String rs = "";
		int total = kor + mat + eng;
		
		boolean check = lowCheck(kor, mat, eng); //return 데이터형을 변수에 넣음 
		
		if (check) {
			rs = "과락";
		}else if (total >= 180) {
			rs = "pass";
		}else {
			rs = "fail";
		}
		
		System.out.println("결과는 " + rs);

	}
	
	//함수(메소드)만들기
	static boolean lowCheck(int k, int m, int e) {
		boolean check = false;     //default 값이 false이므로 
		if (k < 40 || m < 40 || e < 40) {
			check = true;
		}
		return check;
	}
}
