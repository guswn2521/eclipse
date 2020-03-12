package test2;

import java.util.Scanner;

public class Add implements Action{

	@Override
	public void act(Scanner sc) {
		System.out.println("회원정보입력 ");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("국가 : ");
		String nation = sc.next();
		
		MemVO member = new MemVO(age, name, nation);
		addMember(member);
	}

	private void addMember(MemVO member) {
		int index = MemMain.members.length;
		MemVO[] temp = new MemVO[index + 1]; //새로 추가할 멤버자리
		for(int i=0;i<index;i++) {
			temp[i] = MemMain.members[i];
		}
		temp[index] = member;
		MemMain.members = temp;
		
	}
	
	
	
}
