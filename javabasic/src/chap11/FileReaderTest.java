package chap11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			fr = new FileReader("d:/bigdata/javastudy/txt/test1.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
