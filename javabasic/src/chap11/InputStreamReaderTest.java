package chap11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	
	InputStreamReader isr = null;  //inputstream =>reader
	BufferedReader bfr = null;
	
	public static void main(String[] args) {
		InputStreamReaderTest isrt = new InputStreamReaderTest();
		User user = isrt.getUserInfo();
		System.out.println(user);

	}
	
	private User getUserInfo() {
		User user = null;
		isr = new InputStreamReader(System.in);
		bfr = new BufferedReader(isr);
		
		try {
			System.out.println("USER INFO");
			System.out.println("=====================");
			System.out.println("id : ");
			String id = bfr.readLine();
			System.out.println("passwd : ");
			String passwd = bfr.readLine();
			System.out.println("name : ");
			String name = bfr.readLine();
			System.out.println("age : ");
			int age = Integer.parseInt(bfr.readLine());
			//int age = bfr.read();
			System.out.println("dong : ");
			String dong = bfr.readLine();
			
			user = new User(id, passwd, name, dong, age);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return user;
	}

}
