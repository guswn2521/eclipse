package chap08;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		//Math 수학관련, 모든 메서드는 static
		//0 ~ 99
		int num = (int)(Math.random()*99);
		//1 ~ 100
		int num1 = (int)(Math.random()*100)+1;
		
		Random random = new Random();
		//1 ~ 100
		for(int i=0;i<10;i++) {
			num = random.nextInt(101);
			System.out.println(num);
			System.out.println(random.nextLong());
			
		}
		
	}

}
