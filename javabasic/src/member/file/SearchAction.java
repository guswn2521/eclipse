package member.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("검색할 회원이름을 넣어주세요.");
		System.out.println("이름 : ");
		String sname = sc.next();
		
		FileReader fr = null;
		BufferedReader br = null;
		StringTokenizer st = null;
		
		try {
			fr = new FileReader("d:/bigdata/javastudy/txt/member2.txt");
			br = new BufferedReader(fr);
			String str =null;
			String name,tel,email,nation;
			int age;
			boolean searchFlag = false;
			
			try {
				while((str = br.readLine())!= null) {
					st = new StringTokenizer(str,",");
					age = Integer.parseInt(st.nextToken());
					name = st.nextToken();
					tel = st.nextToken();
					email = st.nextToken();
					nation = st.nextToken();
					
					if(sname.equals(name)) {
						String s = "name : %s, age : %s, email : %s,";
						s = s + "nation : %s, tel : %s%n";
						System.out.printf(s,name, age, email, nation, tel);
						searchFlag = true;
						break;
					}
					
				}
				if(!searchFlag) {
					System.out.println(sname + "님 없음");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
