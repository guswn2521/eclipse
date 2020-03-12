package test2;

import java.util.Scanner;

public class MemMain {

	static MemVO[] members;
	
	public static void main(String[] args) {
		MemService ms = new MemService();
		Scanner sc = new Scanner(System.in);
		members = new MemVO[0];
		boolean isStop = false;
		
		do {
			System.out.println("메뉴선택 1~5");
			System.out.println("1.회원가입");
			System.out.println("2.회원보기");
			System.out.println("3.회원삭제");
			System.out.println("4.회원수정");
			System.out.println("5.종료");
			
			String command = sc.next();
			Action action = null;
			switch (command) {
			case "1":
				action = new Add();
				ms.process(action, sc);
				break;
			case "2":
				action = new List();
				ms.process(action, sc);
				break;
			case "3":
				action = new Delete();
				ms.process(action, sc);
				break;
			case "4":
				action = new Update();
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

	}

}
