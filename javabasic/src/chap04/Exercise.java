package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String names[] = {"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
//		int index = -1;
//		Scanner sc = new Scanner(System.in);
//		do {
//			String name = sc.next();
//			for(int i=0;i<names.length;i++) {
//				if(name.equals(names[i])) {
//					index = i;
//				}
//			}
//			if(index != -1) {
//				System.out.printf("인덱스 %s",index);
//				break;
//			}
//			System.out.println("없음");
//			
//			
//		}while(true);
		
//		int[] num = {};
//		int[] nums = {};
//		
//		for(int i=0;i<=10;i=i+1) {
//			num[i] = i+1;
//			nums[i] = i;
//		}
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(nums));
		
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//	
//		for(int num : arr) {
//			sum += num;
//		}
//		System.out.println("sum = "+sum);
		
//		int [][] arr = {
//				{5,5,5,5,5},
//				{10, 10, 10,10,10},
//				{20, 20,20,20,20},
//				{30,30,30,30,30}
//		};
//		
//		int total = 0;
//		float avg = 0;
//		int n = 0;
//		
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0; j<arr[i].length;j++) {
//				total += arr[i][j];
//				n++;
//			}
//		}
//		System.out.println("total = " + total);
//		System.out.println("average = " + (float)total / n);
		
		//9까지의 숫자 중 랜덤으로 숫자 3개 출력하기
//		int[] ball = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		for (int i=0;i<3;i++) {
//			ball3[i] = (int)(Math.random()*9)+1;
//		}
//		System.out.println(Arrays.toString(ball));
		
		//입력받은 돈에대해 잔돈출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("돈입력");
//		int money = sc.nextInt();
//		int[][] coin = {{500,5}, {100,5}, {50,5}, {10,5}};
//		int coin000 = 0, change = 0;
//		for(int i=0;i<coin.length;i++) {
//			coin000 = money / coin[i][0];
//			
//			if (coin000>5) {
//				System.out.println("잔돈부족");
//				money -= (5 * coin[i][0]);
//				coin000 = 5;
//				System.out.printf("%s원 %s개%n",coin[i][0],coin000);
//				continue;
//			}else {
//				change = money % coin[i][0];
//				money = change;
//				System.out.printf("%s원 %s개",coin[i][0],coin000);
//			}	
//		}
//		
		//배열 데이터에 따라 별찍기
//		int [] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
//		int [] counter = new int[4];
//		for(int i=0;i<answer.length;i++) {
//			for(int j=0;j<answer[i];j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		char[][] star = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'}
//		};
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0; j<star[i].length;j++) {
//				System.out.println(star[3-j][i]);
//				star[i][j] = star[3-j][i];
//			}
//			System.out.println(Arrays.toString(star));
//		}
		
		int[]num = new int[10];
		boolean check = true;
		for(int i=0;i<num.length;i++) {
			int n = (int)(Math.random()*10);
			num[i] = n;
		}
		System.out.println(Arrays.toString(num));
		for(int j=0;j<num.length-1;j++) {
			for(int i=0;i<num.length-1;i++) {
				if(num[i]>num[i+1]) {
					int tmp = num[i];
					num[i] = num[i+1];
					num[i+1] = tmp;
				}
				else check = true;
			if(check)break;
			System.out.println(Arrays.toString(num));	
		}
		}
		
		
		
		
		
		
	}

}
