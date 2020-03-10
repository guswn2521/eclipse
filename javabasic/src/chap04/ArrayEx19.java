package chap04;

import java.util.Arrays;

public class ArrayEx19 {

	public static void main(String[] args) {
		int[][]score = {
				{100,90,80},
				{70,60,50},
				{40,30,30},
				{20,90,70},
				{50,50,60}
			};
		
		int total = 0, subTotal = 0, all = 0;
		float avg = 0, subAvg = 0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				total += score[i][j];
				all += score[i][j];
			}
			System.out.printf("학생 %s의 총점은 %s  \t",i+1,total);
			avg = (float)total / score[i].length;
			System.out.printf("학생 %s의 평균은 %s%n",i+1,avg);
			
			total = 0;
		}
		System.out.printf("모든 학생의 총점은 %s%n",all);
		System.out.println("모든 학생의 평균은 " + all/15);
		System.out.println();

		String subject = "";
		
		for(int i=0;i<score[i].length;i++) {
			for(int j=0;j<score.length;j++) {
				
				subTotal += score[j][i];
				}
			switch(i) {
			case 0:
				subject = "국어";
				break;
			case 1:
				subject = "수학";
				break;
			case 2 : 
				subject = "영어";
				break;
			}
			System.out.printf("%s과목의 총점은 %s \t",subject,subTotal);
			subAvg = (float)subTotal / score.length;
			System.out.printf("%s과목의 평균은 %s%n",subject,subAvg);
			subTotal=0;
		}
		for(int i=0;i<score.length;i++) {
			System.out.print(Arrays.toString(score[i]));
		}
			
	}

}
