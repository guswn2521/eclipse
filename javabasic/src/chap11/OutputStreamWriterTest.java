package chap11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {

	public static void main(String[] args) {
		FileOutputStream fos = null; //byte
		OutputStreamWriter osw = null; //byte -> char
		BufferedWriter bw = null;
		
		try {
			fos = new FileOutputStream("d:/bigdata/javastudy/txt/os.txt");
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			bw.write("OutputStreamWriter 한글테스트");
			bw.newLine();
			bw.flush();
			bw.write("OutputStreamWriter 한글테스트2");
			bw.newLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fos.close();
				osw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}
	

}
