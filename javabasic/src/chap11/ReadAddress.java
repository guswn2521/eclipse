package chap11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {

	public static void main(String[] args) {
		FileInputStream fi = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		
		try {
			fi = new FileInputStream("D:/bigdata/javastudy/txt/address.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);
			
			String str = null;
			while((str = bfr.readLine())!= null) {
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
				fi.close();
				isr.close();
				bfr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
