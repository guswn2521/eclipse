package bj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BufferedReader bfr = null;
		BufferedWriter bfw = null;
		FileWriter fw = null;
		FileInputStream fi = null;
		InputStreamReader isr = null;
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		try {
			fw = new FileWriter("C:/Users/205/git/add.txt",true);
			bfw = new BufferedWriter(fw);
			
			for(int i=0;i<T;i++) {
				int x = (int)(Math.random()*1000)+1;
				int y = (int)(Math.random()*1000)+1;
				bfw.write(x);
				bfw.write(y);
				int add = x+y;
				bfw.write(add+"\r\n");
				
			}
			bfw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			fi = new FileInputStream("C:/Users/205/git/add.txt");
//			isr = new InputStreamReader(fi);
//			bfr = new BufferedReader(isr);
//			
//			String str = null;
//			while((str = bfr.readLine())!=null) {
//				System.out.println(str);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		finally {
			try {
				//fi.close();
				//isr.close();
				sc.close();
				//bfr.close();
				bfw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
//		for(int i=0;i<T;i++) {
//			int x, y;
//			x = sc.nextInt();
//			y = sc.nextInt();
//			int add = x+ y;
//			System.out.println(add);
//		}

	}

}
