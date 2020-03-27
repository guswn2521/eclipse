package bj;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	}
	static int d(int n) {
		int sum = 0;
		while(n != 0) {
			sum+= (n%10);
			n = n /10;
		}
		return sum;
	}
	
}
