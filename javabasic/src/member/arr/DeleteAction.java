package member.arr;

import java.util.Scanner;

public class DeleteAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 넣으시오.");
		System.out.print("이름 : ");
		String name = sc.next();
		
		deleteMember(name);
		
		
	}

	private void deleteMember(String name) {
		int deleteIndex = -1;//회원이 없을때
		MemberVO[] members = MemberMain.members;
		MemberVO[] temp = null;
		int i = 0;
		for(MemberVO member : members) {
			if(member.getName().equals(name)) {
				deleteIndex = i;
				break;
			}
			i++;
		}
		if(deleteIndex == -1) {
			System.out.println("member name not found");
			return;
		}
		if(members.length >= 1) {
			temp = new MemberVO[members.length-1];
			for(int j=0;j<members.length;j++) {
				if(j == deleteIndex) { //검색된 이름 index
					continue;
				}
				else if(j > deleteIndex){
					temp[j-1] = members[j];
				}
				else {temp[j] = members[j];
				}
				
			}
		}
		
		MemberMain.members = temp;
		
	}
	
	
}
