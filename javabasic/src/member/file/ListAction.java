package member.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListAction implements Action{

	@Override
	public void execute(Scanner sc) {

		FileReader fr = null;
		BufferedReader bfr = null;//한줄씩 읽기
		StringTokenizer st = null;

		try {
			fr = new FileReader("d:/bigdata/javastudy/txt/member2.txt");
			bfr = new BufferedReader(fr);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = null;
		try {
			if((str = bfr.readLine())!=null) {
				st = new StringTokenizer(str,",");
				
//				String tmp = "";
//				String sAge = st.nextToken();
//				tmp = sAge.split("=")[0];
//				
//				int age = Integer.parseInt(tmp);
//				String name = st.nextToken();
//				tmp = name.split("=")[1];
//				name = tmp;
//				String tel = st.nextToken();
//				tmp = tel.split("=")[1];
//				tel = tmp;
//				String email = st.nextToken();
//				tmp =email.split("=")[1];
//				email = tmp;
//				String nation = st.nextToken();
//				tmp =nation.split("=")[1];
//				
//				nation = tmp.replace("]","");
				
				int age = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				String tel = st.nextToken();
				String email = st.nextToken();
				String nation = st.nextToken();
				
				
				String s = "name : %s, age : %s, email : %s,";
				s = s + "nation : %s, tel : %s%n";
				System.out.printf(s,name, age, email, nation, tel);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bfr.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
