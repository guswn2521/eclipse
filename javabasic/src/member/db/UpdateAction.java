package member.db;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 코드를 넣으시오.");
		MemberDao dao = new MemberDao();
		ArrayList<MemberVO> memberList = null;
		
		System.out.println("idx:");
		System.out.println("age:");
		System.out.println("tel:");
		System.out.println("email:");
		System.out.println("nation:");
		int idx = sc.nextInt();
		int age = sc.nextInt();
		String tel =sc.next();
		String email = sc.next();
		String nation = sc.next();
		
		MemberVO member = new MemberVO(idx, age, tel, email, nation);
		//memberList.get(member.getIdx());
		
		int rs = dao.updateMember(member);
		if(rs==0) {
			System.out.println("수정할 회원이 없습니다.");
		}else {
			System.out.println(rs + "명 수정완료");
		}
		
		memberList = dao.getMemberList();
		
		MemberVO member1 = getUpdateMember(idx);
		
		
	}
	
	
	
	
	public MemberVO getUpdateMember(int idx) {
		MemberVO member = null;
		MemberDao dao = new MemberDao();
		member = dao.getMember(idx);
		
		return member;
	}
	
}
