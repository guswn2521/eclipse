package chap03;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		String id = "java";
		String pwd = "java";
		
		System.out.println("ID :");
		System.out.println("PWD :");
		
		Scanner sc = new Scanner(System.in);
		String iId = sc.next();
		String iPd = sc.next();
		
		boolean con = iId.equals(id);
//		
		if (!con) {
			System.out.println("회원아님");
		}else {
			if (pwd.equals(pwd)) {
				System.out.println("welcome");
			}else {
				System.out.println("비번확인");
			}
		}
//		if (con) {
//			if(pwd.equals(pwd)) {
//				System.out.println("환영");
//			}else {
//				System.out.println("비번틀림");
//			}
//		}else {
//			System.out.println("회원아님");
//		}
//		
//
//		
		
		if (iId.equals(id) && iPd.equals(pwd)) {
			System.out.println("welcome");
		} else {
			System.out.println("check again");
		}

	}

}
