package chap03;

public class FlowTest11 {

	public static void main(String[] args) {
		// 50까지 합구하기
//		int sum = 0;
//		
//		for(int i = 0; i <= 50; i += 2) {
//			System.out.println(i);
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		//2단 구하기
//		int dan = 2;
//		for(int i = 1; i <= 9; i++) {
//			int times = dan * i;
//			System.out.printf("%s * %s = %s%n", dan, i , times);
//		}
		
		//구구단
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%s단%n",i);
			for (int j = 1; j <= 9; j++) {
				int times = i * j;
				System.out.printf("%s * %s = %s%n", i, j, times);
			}
			System.out.println("=================================");
		}
		
	}

}
