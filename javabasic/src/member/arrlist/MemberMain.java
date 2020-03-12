package member.arrlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MemberMain {
	//up
	static ArrayList<MemberVO> members; //회원정보저장
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Scanner sc = new Scanner(System.in);
		//up
		members = new ArrayList<MemberVO>();
		boolean isStop = false;
		
		do {
			System.out.println("===========");
			System.out.println("메뉴 선택(1~5)");
			System.out.println("===========");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 보기");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 수정");
			System.out.println("5. 종료");
			
			String command = sc.next();
			Action action = null;
			
			switch (command) {
			case "1":
				action = new AddAction();
				ms.process(action, sc);
				break;
			case "2":
				action = new ListAction();
				ms.process(action, sc);
				break;
			case "3":
				action = new DeleteAction();
				ms.process(action, sc);
				break;
			case "4":
				action = new UpdateAction();
				ms.process(action, sc);
				break;
			case "5":
				isStop = true;
				break;
			default:
				isStop = true;
				break;
			}
		}while(!isStop);
		
		for(MemberVO member : members) {
			System.out.println(member);
		}
		
		//System.out.println(Arrays.toString(members));

	}

}
