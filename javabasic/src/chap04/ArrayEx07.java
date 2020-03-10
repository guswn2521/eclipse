package chap04;

import java.util.Arrays;

public class ArrayEx07 {

	public static void main(String[] args) {
		//lotto 숫자뽑기 내버전
		int[] lottoBall = new int[45];

		for(int i=0; i<lottoBall.length;i++) lottoBall[i] = i+1;
		
		int[] lastWeek = {8, 19, 20, 21, 33, 39};
		int[][] myLottoNumber = new int[6][6];
		int n=0;
		int alpha = 0;
		String a = "";
		String b = "";
		
		for(int i=0;i<6;i++) {
			for(int h = 0;h<300;h++) {
				n = (int)(Math.random()*6);
				int tmp = lastWeek[0];
				lastWeek[0] = lastWeek[n];
				lastWeek[n] = tmp;
				
			}
			for(int x : lastWeek) {
				alpha = alpha+x;
				if (alpha != 0) {
					break;
				}
			}
			//System.out.println(alpha);
//			a = Arrays.toString(lastWeek);
//			System.out.println(a);
//			b = a.substring(1,3);
//			System.out.println(b);
			
			
			for(int k=0;k<2000;k++) {
				n = (int)(Math.random()*45);
				int tmp = lottoBall[0];
				lottoBall[0] = lottoBall[n];
				lottoBall[n] = tmp;
			}
			for(int j=0;j<5;j++) {
				myLottoNumber[i][j] = lottoBall[j];
				if(myLottoNumber[i][j] != alpha) {
					continue;
				}
			}
			myLottoNumber[i][5] = alpha;
		}
		
		for(int[]arr : myLottoNumber) {
			System.out.println(Arrays.toString(arr));
		}//간단한 for문으로 출력
		
		
	}

}
