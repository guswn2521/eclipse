package member.db;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		
		MemberDao dao = new MemberDao();
		ArrayList<MemberVO> memberList = dao.getMemberList();
	}
	
}
