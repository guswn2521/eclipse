package chap11;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		String msg = "ByteArrayOutputStreamTest";
		ByteArrayOutputStream bao = null;
		byte[] b = msg.getBytes();
		bao = new ByteArrayOutputStream();
		try {
			bao.write(b);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				bao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end");

	}

}
