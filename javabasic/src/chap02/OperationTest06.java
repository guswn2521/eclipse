package chap02;

public class OperationTest06 {

	public static void main(String[] args) {
//		int x = 8;
//		int y = 3;
//		int rs = 0;
//		boolean bRs = false;
//		
//		//&
//		rs = x & y;
//		System.out.println("x & y : " + rs);
//		
//		rs = x | y;
//		System.out.println("x | y : " + rs);
//		
//		rs = x ^ y ;
//		System.out.println("x ^ y : " + rs);
		
		int x = 3;
		int rs = 0;
		
		rs = x << 2; //3 * 4
		System.out.println(rs);
		String sX = Integer.toBinaryString(x);
		String sRs = Integer.toBinaryString(rs);
		
		System.out.println(sX);
		System.out.println(sRs);
		
		
		
		
		
	}

}
