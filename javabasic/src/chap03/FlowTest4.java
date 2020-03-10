package chap03;

import java.util.Scanner;

public class FlowTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int gen ;
		if (age / 10 == 1) {
			gen = 10;
		}else if (age / 10 == 2) {
			gen = 20;
		}else if (age / 10 == 3) {
			gen = 30;
		}else if (age / 10 == 4) {
			gen = 40;
		}else if (age / 10 == 5) {
			gen = 50;
		}else {
			gen = 00;
		}
		
		System.out.printf("%s대",gen);

	}

}
