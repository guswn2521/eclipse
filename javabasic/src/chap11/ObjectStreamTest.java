package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		User beforeUser = new User("aaa", "1234", "홍길동", "구로", 16);
		User afterUser = null;
		
		FileOutputStream fileos = null;
		ObjectOutputStream objectos = null;
		FileInputStream fileis = null;
		ObjectInputStream objectis = null;
		
		try {
			fileos = new FileOutputStream("d:/bigdata/javastudy/txt/userInfo.ser");
			objectos = new ObjectOutputStream(fileos);			
			objectos.writeObject(beforeUser);//User -> object
			
			fileis = new FileInputStream("d:/bigdata/javastudy/txt/userInfo.ser");
			objectis = new ObjectInputStream(fileis);
			
			afterUser = (User)objectis.readObject();
			
			System.out.println(afterUser);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			finally {
			try {
				objectos.close();
				fileos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		System.out.println("end");
		

	}

}
