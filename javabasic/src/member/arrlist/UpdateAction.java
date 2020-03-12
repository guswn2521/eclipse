package member.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 이름을 넣으세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		
		int index = getUpdateMember(name);
		if(index == -1) {
			System.out.println("member not found");
		}else {
			System.out.print("전화번호 : ");
			String tel = sc.next();
			System.out.print("국가 : ");
			String nation = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			MemberVO member;
			member = MemberMain.members.get(index);
			member.setAge(age);
			member.setEmail(email);
			member.setNation(nation);
			member.setTel(tel);
			}
	}

	private int getUpdateMember(String name) {
		ArrayList<MemberVO> members = MemberMain.members;
		MemberVO member;
		int index = -1;
		
		for(int i=0;i<members.size();i++) {
			member = members.get(i);
			if(member.getName().equals(name)) {
				index = i;//입력된 name의 주소 넣기
			}
		}
		return index;
	}
	
}
