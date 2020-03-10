package chap03;

public class FlowTest20 {

	public static void main(String[] args) {
		
//		String s = "";
//		for(int outer = 1;outer<=3;outer++) {
//			
//			for(int inner=1;inner<=3;inner++) {
//				s = "outer = " + outer + ", inner = " + inner;
//				System.out.println(s);
//				
//			}
//			
//		}
		
		
//		int sum = 0;
//		for(int i=1; i<=25; i=i + 5) {
//			for(int j=0; j<=4; j++) {
//				sum = i+j;
//				System.out.print(sum);
//			}
//			System.out.println();
//		}
		
//		int n=0;
//		
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.println();
//			}
//		}
//		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		
//		for(int i=5;i>=1;i--) {
//			for(int j=1; j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//			
//		}
		
		//*10개씩 5번
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//* 1개부터 7개까지
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//13579 *찍기
//		for(int i=1;i<=10;i=i+2) {
//			for(int j=1 ;j<=i ;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//* 피라미드로찍기
		
//		for(int i=1;i<=5;i++) {
//			for(int k=1;k<= 5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<= 2*i-1; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		//두개의 주사위를 던졌을때 6이되는 경우의 수
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if (i+j == 6) {
//					System.out.printf("(%s,%s)%n",i,j);
//				}
//			}
//		}
		
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%s * %s = %s\t",j,i,j*i);
//			}
//			System.out.println("");
//		}
		
		for (int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x + 4*y) == 10){
					System.out.printf("(%s,%s)",x,y);
					System.out.println();
				}
			}
			
		}
		
		
	}

}
