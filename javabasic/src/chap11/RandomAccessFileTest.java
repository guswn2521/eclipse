package chap11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile raf = null;
		String file = "d:/bigdata/javastudy/txt/random.txt";
		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println("시작 포인터 : " + raf.getFilePointer());
			raf.writeInt(75);
			raf.writeBoolean(false);
			raf.writeChar('A');
			raf.writeLong(10000000000000000l);
			System.out.println("입력후 포인터 : " + raf.getFilePointer());
			raf.seek(0);
			System.out.println("처음값" + raf.readInt());
			System.out.println("boolean값 : " + raf.readBoolean());
			System.out.println("3 : " + raf.readChar());
			System.out.println("4 : "+raf.readLong());
			
//			raf.skipBytes(2);
//			System.out.println(raf.readLong());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
