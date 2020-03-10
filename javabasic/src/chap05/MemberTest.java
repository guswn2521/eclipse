package chap05;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		SearchService sv = new SearchService();
		Member member = new Member();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("검색할 이름 ");
			String name = sc.next();
			member = sv.searchMember2(name);
			
			if(member != null) {
				sv.printInfo(member);
				break;
			}
			System.out.println("member not exist.");
		}while(true);
		
		sc.close();

	}

}
