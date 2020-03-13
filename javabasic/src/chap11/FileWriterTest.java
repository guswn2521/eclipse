package chap11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter 테스트입니다.\n";
		
		try {
			fw = new FileWriter("d:/bigdata/javastudy/txt/fw.txt",true);
			fw.write(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
