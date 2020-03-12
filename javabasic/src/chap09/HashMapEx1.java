package chap09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("asdf","1111");
		map.put("asdf", "33333");
		System.out.println(map.get("asdf"));
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id와 password입력 : ");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id없음");
				continue;
			}else {
				boolean b = map.get(id).equals(pwd);
				if(!b) {
					System.out.println("비번불일치");
				}else {
					System.out.println("성공");
					break;
				}
				
			}
			
		}
	}

}
