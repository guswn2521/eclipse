package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int Quadrant = 0;
		if(x*y > 0) {
			if(x > 0) {
				Quadrant = 1;
			}else {
				Quadrant = 3;
			}
		}else {
			if(x>0) {
				Quadrant = 4;
			}else Quadrant = 2;
		}
		System.out.println(Quadrant);

	}

}
