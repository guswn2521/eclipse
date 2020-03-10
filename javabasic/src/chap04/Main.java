package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		float pi = 3.141592f;
//		float shortPi = Math.round(pi *10);
//		System.out.println(shortPi);
//		Scanner
//		int [] nums = {1,2,3};
//		Arrays.toString(nums)
		int x = -1;
		int y = 3;
		int result = 0;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(Integer.toBinaryString(y<<2));
		System.out.println(Integer.toBinaryString(x>>1));

	}

}
