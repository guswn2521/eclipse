package chap11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fIn1 = null;
		FileInputStream fIn2 = null;
		FileInputStream fIn3 = null;
		
		SequenceInputStream si1 = null;
		SequenceInputStream si2 = null;
		
		try {
			fIn1 = new FileInputStream("d:/bigdata/javastudy/txt/test3.txt");
			fIn2 = new FileInputStream("d:/bigdata/javastudy/txt/test2.txt");
			fIn3 = new FileInputStream("d:/bigdata/javastudy/txt/test1.txt");
		
			Vector v = new Vector();
			v.add(fIn1);//인덱스 0부터
			v.add(fIn2);
			v.add(fIn3);
			
			Enumeration fIns = v.elements();
			
//			ArrayList a = new ArrayList();
//			a.add(fIn1);
//			a.add(fIn2);
//			a.add(fIn3);
//			Iterator it = a.iterator();
			//Enumeration fIns = (Enumeration)a.iterator();
			//si1 = new SequenceInputStream(fIns);
			
			si1 = new SequenceInputStream(fIns);
			
			int var_readByte = -1;
			while((var_readByte = si1.read())!=-1) {
				System.out.println((char)var_readByte);
			}
			System.out.println();
			
			fIn1 = new FileInputStream("d:/bigdata/javastudy/txt/test3.txt");
			fIn2 = new FileInputStream("d:/bigdata/javastudy/txt/test2.txt");
			
			si2 = new SequenceInputStream(fIn1, fIn2);
			var_readByte = -1;
			while((var_readByte = si2.read())!=-1) {
				System.out.println((char)var_readByte);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				si1.close();
				si2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
