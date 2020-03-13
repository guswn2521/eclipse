package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fo = null;
		String msg = "FileOutputStreamTest \t";
		byte[] byteArray = msg.getBytes();
		
		try {
			fo = new FileOutputStream("d:/bigdata/javastudy/txt/test.txt",false);
			fo.write(byteArray);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
		
			try {
				fo.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		FileInputStream fIn = null;
		
		try {
			fIn = new FileInputStream("d:/bigdata/javastudy/txt/test.txt");
			int var_read = -1;
			while((var_read = fIn.read())!=-1) {
				System.out.println((char)var_read);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		System.out.println("end");

	}

}
