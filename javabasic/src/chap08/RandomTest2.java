package chap08;

import java.util.Random;

public class RandomTest2 {
	public static void main(String[] args) {
		Random r2 = new Random(5);
		Random r1 = new Random(5);
		
		for(int i=0;i<9;i++) {
			System.out.println("r1: " + r1.nextInt());
		}
		System.out.println("=============");
		for(int i=0;i<9;i++) {
			System.out.println("r2 : " + r2.nextInt());
		}
	}
}
