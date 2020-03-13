package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fIn = null;
		String file = "d:\\bigdata\\javastudy\\txt\\test.txt";
		try {
			fIn = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		int var_read = -1;
		try {
			while((var_read = fIn.read())!= -1) {
				System.out.println((char)var_read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
