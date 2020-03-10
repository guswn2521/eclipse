package chap03;

import java.util.Scanner;

public class FlowTest7 {

	public static void main(String[] args) {
		//1,3 남자 - 2,4 여자
		String regNum = "940520-2111111";
		char check = regNum.charAt(7);
		
		String s = check + "";
		int i = Integer.parseInt(s);
		
		String sex = " ";
		
		
		if (check == '1' || check == '3') {
			sex = "남자";
		}
		else if (check == '2' || check == '4') {
			sex = "여자";
		}
		System.out.println(sex);
		
		
		
		switch(check) {
		case '1' : case '3':
			sex = "남자";
			break;
		case '2' : case '4':
			sex = "여자";
			break;
		}
		System.out.println(sex);
		
		
		
		Scanner sc = new Scanner(System.in);
		String regnum = sc.nextLine();
		sc.close();
		String n = regnum.substring(7,8);
		int n1 = Integer.parseInt(n);
		
		switch(n1) {
		case 1 : case 3:
			sex = "남자";
			break;
		case 2 : case 4:
			sex = "여자";
			break;
		}
		System.out.println(sex);
		

	}

}
