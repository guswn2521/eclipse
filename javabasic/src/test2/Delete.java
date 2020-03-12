package test2;

import java.util.Scanner;

public class Delete implements Action{

	@Override
	public void act(Scanner sc) {
		System.out.println("삭제할 회원 이름 : ");
		
		String name = sc.next();
		deleteMember(name);
		
	}

	private void deleteMember(String name) {
		int dIndex = -1;
		MemVO[] members = MemMain.members;
		MemVO[] temp = null;
		int i= 0;
		for(MemVO member : members) {
			if(member.getName().equals(name)) {
				dIndex = i;
				break;
			}
			i++;
		}
		if(dIndex == -1) {
			System.out.println("member not found");
			return;
		}
		if(members.length >= 1) {
			temp = new MemVO[members.length-1];
			for(int j=0;j<members.length;j++) {
				if(j==dIndex) {
					continue;
				}
				else if(j>dIndex) {
					temp[j-1] = members[j];
				}
				else {
					temp[j] = members[j];
				}
			}
		}
		MemMain.members = temp;
		
	}
	
}
