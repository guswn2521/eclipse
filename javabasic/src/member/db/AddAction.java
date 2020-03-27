package member.db;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAction implements Action{//회원가입

	public void execute(Scanner sc) {
		MemberDao dao = new MemberDao();
		System.out.println("index : ");
		System.out.println("age:");
		System.out.println("name :");
		System.out.println("tel:");
		System.out.println("email:");
		System.out.println("nation:");
		int index = sc.nextInt();
		int age = sc.nextInt();
		String name = sc.next();
		String tel = sc.next();
		String email = sc.next();
		String nation = sc.next();
		
		MemberVO member = new MemberVO(age, name, tel, email, nation);
		//addMember(member);
		ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
		
		dao.insertMember(member);
		memberList = dao.getMemberList();
		memberList.add(index, member);
		
		
		
	}
	private void addMember(MemberVO member) {
		MemberDao dao = new MemberDao();
		int rs = dao.insertMember(member);
		System.out.println(rs +"건 입력했습니다.");
	}
	
}
