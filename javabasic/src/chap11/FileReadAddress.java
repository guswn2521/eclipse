package chap11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReadAddress {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
			fr = new FileReader("d:/bigdata/javastudy/txt/address.txt");
			bfr = new BufferedReader(fr);
			String str = null;
			while((str = bfr.readLine())!=null) {
				System.out.println(str);
				st = new StringTokenizer(str,",");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
				System.out.println();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
