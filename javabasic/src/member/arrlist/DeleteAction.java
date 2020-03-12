package member.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 넣으시오.");
		System.out.print("이름 : ");
		String name = sc.next();
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member;
		
		for(int i=0;i<members.size();i++) {
			member = members.get(i);
			if(member.getName().equals(name)) {
				members.remove(i);
			}	
		}
		int i=0;
		//향상된 for문
		for(MemberVO m : members) {
			if(m.getName().equals(name)) {
				members.remove(i);
				break;
			}
			i++;
		}

		}

	
	
}
