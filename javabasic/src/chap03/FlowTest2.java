package chap03;

public class FlowTest2 {

	public static void main(String[] args) {
		int n =8;
		
		if(n > 10) {
			System.out.println("n은 10 초과");
			if (n %2 == 0) {
				System.out.println("n은 짝수");
			}else {
				System.out.println("n은 홀수");
			}
		}else if(n == 10) {
			System.out.println("n은 10");
		}else {
			System.out.println("n은 10미만");
		}

	}

}
