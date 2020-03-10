package chap03;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		int n = 0;
		for(int i=1;i<=100;i++) {
			if(i%2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0) {
				System.out.print(i + " ");
				n += 1;
			}
			if (n ==10) {
				System.out.println();
				n = 0;
			}
		}
	}

}
