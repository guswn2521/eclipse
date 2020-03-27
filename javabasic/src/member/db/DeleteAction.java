package member.db;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 코드를 넣으시오.");
		System.out.println("코드 : ");
		int idx = Integer.parseInt(sc.next());
		deleteMember(idx);
		
//		MemberDao dao = new MemberDao();
//		System.out.println("index : ");
//		int idx = sc.nextInt();
//		dao.deleteMember(idx);
//		ArrayList<MemberVO> memberList = dao.getMemberList();

	}
	private void deleteMember(int idx){
		MemberDao dao = new MemberDao();
		int rs = dao.deleteMember(idx);

		if(rs ==0) {
			System.out.println("삭제할 회원이 없습니다.");
		}else {
			System.out.println(idx + "번 삭제 완료했습니다.");
		}		
	
	}
	
	
}
