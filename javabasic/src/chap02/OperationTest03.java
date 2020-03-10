package chap02;

public class OperationTest03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean result = false;


		//>
		result = x > y;
		System.out.println("x > y = " + result);

		//<
		result = x < y;
		System.out.println("x < y = " + result);

		//>=
		result = x >= y;
		System.out.println("x >= y = " + result);

		//<=
		result = x <= y;
		System.out.println("x <= y = " + result);

		//==
		result = x == y;
		System.out.println("x == y = " + result);

		//!=
		result = x != y;
		System.out.println("x != y = " + result);

	}

}
