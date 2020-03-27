package member.db;

import java.util.Scanner;

public class SearchAction implements Action{

	public void execute(Scanner sc) {
		MemberDao dao = new MemberDao();
		System.out.println("index or name?");
		String choice = sc.next();
		if(choice.equals("index")) {
			System.out.println("index : ");
			int index = sc.nextInt();
			MemberVO member = dao.getMember(index);
			System.out.println(member);
		}else if(choice.equals("name")) {
			System.out.println("name : ");
			String name = sc.next();
			dao.getMemberSearch(name);
		}
		
		
		
	}

}
