package bj;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] scores = new double[n];
		int m=0;
		for(int i=0;i<n;i++) {
			int sjt = sc.nextInt();
			scores[i] = sjt;
			if(sjt > m) {
				m = sjt;
			}
		}
		double sum = 0;
		for(int i=0;i<n;i++) {
			double d = (double)scores[i]*100 / m;
			sum = sum + d;
		}
		System.out.println(sum / n);
	}
}
