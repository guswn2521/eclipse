package test2;

import java.util.Scanner;

public class List implements Action{

	@Override
	public void act(Scanner sc) {
		MemVO[] members = MemMain.members;//memVO형 배열에 회원정보 넣음.
		if(members.length >=1) {
			for(MemVO member : members) {
				int age = member.getAge();
				String name = member.getName();
				String nation = member.getNation();
				System.out.println("age : "+age+" name : "+name+" nation : " + nation);
			}
		}else {
			System.out.println("member not found");
		}
		
	}
	

}
