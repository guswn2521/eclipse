package chap03;

import java.util.Scanner;

public class FlowTest9 {

	public static void main(String[] args) {
		//가위 1 바위 2 보 3
		int com = (int)(Math.random()*3+1);
//		System.out.println(com);
		int n = 0;
		System.out.println("가위 바위 보 입력 : ");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		sc.close();
		String rs = "";
		
		switch (user) {
		case "가위":
			n = 1;
		break;
		case "바위":
			n = 2;
		break;
		case "보":
			n = 3;
		break;
		default :
			n = 100;
		}
		System.out.println(n);
		
		
		if (com-n == -1 || com-n == 2) {
			rs = "user win";
		}else if (com -n == 0) {
			rs = "tie";	
		}else if (com-n == -2 || com-n == 1) {
			rs = "user lost";
		}else {
			rs = "error";
		}
		System.out.printf("user : %s - com : %s, %s", n, com, rs);
		
	}

}
