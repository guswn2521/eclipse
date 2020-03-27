package chap14;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		ArrayList<MemberVO> memberList = null;
		MemberVO member = null;
		
		
		int search_idx = 1;
		//member = dao.getMember(search_idx);
		//System.out.println(member);
		
		
		
		int age = 40;
		String name = "홍길동4";
		String tel = "4444-3333";
		String email = "4444@";
		String nation = "usa";
		
//		member = new MemberVO(age, name, tel, email, nation);
//		dao.insertMember(member);
		//memberList = dao.getMemberList();

		
		
		//member = dao.getMember(search_idx);
		
		int idx = 1;
//		member = new MemberVO(idx, age, tel, email, nation);
//		dao.updateMember(member);
		
//		
//		dao.deleteMember(idx);
		//memberList = dao.getMemberList();
		
		
		name = "홍";
		memberList = dao.getMemberSearch(name);
		for(MemberVO m : memberList) {
			System.out.println(m);
		}

	}

}
