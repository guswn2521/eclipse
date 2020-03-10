package chap02;

public class OperationTest11 {

	public static void main(String[] args) {
		
		int num = 10;
		String msg = (num > 10) ? "10보다 큼" : "10보다 작거나같음";
		System.out.println(msg);
		
		int num1 = Integer.parseInt(args[0]);
		String aw = (num1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(aw);
		
		int var = Integer.parseInt(args[0]);
		boolean tmp = var >= 0;
		String rs = (tmp) ? "양수" : "음수";
		System.out.println(rs);
		
		
		
	}

}
