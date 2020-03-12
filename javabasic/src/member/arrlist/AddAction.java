package member.arrlist;

import java.util.Scanner;

public class AddAction implements Action{//회원가입

	public void execute(Scanner sc) {
		System.out.println("================");
		System.out.println("회원정보 입력");
		System.out.println("================");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("전화번호 : ");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(age, name, tel, email, nation);
		MemberMain.members.add(member);
		
	}
}
