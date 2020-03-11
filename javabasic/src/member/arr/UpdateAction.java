package member.arr;

import java.util.Scanner;

public class UpdateAction implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 이름을 넣으세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		
		MemberVO member = getUpdateMember(name);
		if(member == null) {
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
			//1 찾은 member주소의 정보를 받아 넣음.
//			member.setAge(age);
//			member.setEmail(email);
//			member.setNation(nation);
//			member.setTel(tel);
			//2 새로 만들어서 이름을 찾고 값을넣음
			member = new MemberVO(age, name, tel, email, nation);
			for(int i=0;i<MemberMain.members.length;i++) {
				if(MemberMain.members[i].getName().equals(name)) {
					MemberMain.members[i] = member;
				}
			}
		}
	}

	private MemberVO getUpdateMember(String name) {
		//수정할 멤버 확인
		MemberVO[] members = MemberMain.members;
		MemberVO member = null; //리턴할 변수형 만들기
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				member = members[i];//입력된 name의 주소 넣기
			}
		}
		return member;
	}
	
}
