package member.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.members;
		if(members.size() >= 1) {
			for(MemberVO member : members) {
				String name = member.getName();
				int age = member.getAge();
				String email = member.getEmail();
				String nation = member.getNation();
				String tel = member.getTel();
				String s = "name : %s, age : %s, email : %s,";
				s = s + "nation : %s, tel : %s%n";
				System.out.printf(s,name, age, email, nation, tel);
			}
		}else {
			System.out.println("member not found.");
		}
		
	}
	
}
