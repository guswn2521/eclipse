package test2;

import java.util.Scanner;

public class Update implements Action{

	@Override
	public void act(Scanner sc) {
		System.out.println("수정할 이름 : ");
		String name = sc.next();
		MemVO member = getUpdateMember(name);
		if(member == null) {
			System.out.println("member not found");
		}
		else {
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("국가 : ");
			String nation = sc.next();
			member.setAge(age);
			member.setNation(nation);
		}
		
		
	}

	private MemVO getUpdateMember(String name) {
		MemVO[] members = MemMain.members;
		MemVO member = null;
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				member = members[i];
			}
		}
		return member;
	}
	
}
