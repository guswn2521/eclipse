package chap11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader bfr = null;
		FileInputStream fi = null;
		InputStreamReader isr = null;
		try {
			fi = new FileInputStream("D:/bigdata/javastudy/txt/bufferReader.txt");
			isr = new InputStreamReader(fi);
			bfr = new BufferedReader(isr);//reader 객체
			
			String str = null;
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				isr.close();
				bfr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		

	}

}
