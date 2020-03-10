package chap04;

public class ArrayEx18 {

	public static void main(String[] args) {
		int[][] score = {{10, 20, 30}
					,{40, 50, 60}
					,{70, 80, 90}
					,{100, 110, 120}
				};
		
		System.out.println(score);     //2차원 배열
		System.out.println(score[0]); // 1차원 배열
		System.out.println(score[0][0]); //값
		System.out.println(score[1][1]);
		System.out.println(score.length); //행
		System.out.println(score[2].length); //열
		
		
		
		
		int sum = 0;
		String s = "[%s][%s]\t";
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.printf(s,score[i][i],score[j][j]);
				sum = sum + score[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);

	}

}
