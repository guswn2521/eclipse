package chap02;

public class OperationTest05 {

	public static void main(String[] args) {

		int inc = 1;
		int dec = 1;
		int result = 0;

		//++
		result = inc++;
		System.out.println("result = " + result);
		System.out.println("inc = " + inc);

		result = ++inc;
		System.out.println("result = " + result);
		System.out.println("inc = " + inc);

		//--
		result = dec--;
		System.out.println("result = " + result);
		System.out.println("dec = " + dec);

		result = --dec;
		System.out.println("result = " + result);
		System.out.println("dec = " + dec);


		System.out.println("3".equals("2"));

	}

}
