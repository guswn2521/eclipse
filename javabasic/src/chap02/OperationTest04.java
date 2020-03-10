package chap02;

public class OperationTest04 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		boolean result = false;
		
		//&&
		result = x < y && y >= 200;
		System.out.println("x < y && y >= 200 :" + result);
		
		result = x < y && y < 200;
		System.out.println("x < y && y < 200 : " + result);
		
		result  = x > y && y++ > 200;
		System.out.println("x < y && y++ > 200 :" + result);
		System.out.println("y = " + y); //200  && 연산에서 앞이 false이면 뒤를 연산안함
		
		
		//||
		result = x < y || y >=200;
		System.out.println("x < y || y >=200 : " + result);
		
		result = x < y || y <200;
		System.out.println("x < y || y <200 : " + result);
		
		result = x > y || y++ >200;
		System.out.println("x > y || y++ >200 : " + result);
		
		result = x < y || y++ >200;
		System.out.println("x < y || y++ >200 : " +result);
		System.out.println("y = " + y); //201  || 연산에서 앞이 true 이면 뒤를 연산안함
	

		
		//!
		result = ! (x > y);
		System.out.println("!(x > y) = " + result);
		

	}

}
