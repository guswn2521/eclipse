package chap04;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = (int)(Math.random()*10);
		}
//		System.out.println(Arrays.toString(numArr));
//		for(int i=0;i<numArr.length;i++) {
//			System.out.print(numArr[i] + " ");
//		}
		System.out.println(Arrays.toString(numArr));
		System.out.println();
		
		
		for(int i=0;i<numArr.length-1;i++) {
			boolean check = false;
			for(int j=0;j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					check = true;
				}
			}
			if(!check) {  //값이 하나도 안바뀜 == 정렬이 완료됨
				break;
			}
			System.out.println(Arrays.toString(numArr));
			System.out.println();
		}

	}

}
