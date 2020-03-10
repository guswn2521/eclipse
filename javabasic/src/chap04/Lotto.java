package chap04;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] ball = new int[39];
		int[] past = {8,19,20,21,29,33};
		int[][] number = new int [6][6];
		int n = 0;
		boolean check = false;
		
		for(int i=0;i<45;i++) {
			check=false;
			for(int j=0;j<past.length;j++) {
				if(i+1==past[j]) {
					check=true;
					break;
				}
			}
			if(check) continue;
			ball[n] = i+1;
			n++;
		}
		System.out.println(Arrays.toString(ball));
		for(int i=0;i<6;i++) {
			for(int k=0;k<1000;k++) {
				n=(int)(Math.random()*39);
				int tmp = ball[0];
				ball[0] = ball[n];
				ball[n] = tmp;
			}
			for(int j=0;j<5;j++) {
				number[i][j] = ball[j];
			}
			
		}
		for(int i=0;i<6;i++) {
			number[i][5] = past[i];
		}
		for(int[]arr : number) {
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
