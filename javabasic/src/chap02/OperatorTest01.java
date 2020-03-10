package chap02;
	/**
	 * 산술 연산자 테스트
	 */
public class OperatorTest01 {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		
		int rs = n1 / n2;
		int rest = n1 - (rs * n2);
		int rs2 = n1 % n2;
		
		System.out.println("rs : " + rs + " " + "rest :" + rest + " " + "rs2 : " + rs2);

		
		//산술연산자
		
		int result = 0;
		int var_int1 = 10;
		int var_int2 = 2;
		
		
		result = var_int1 + var_int2;
		System.out.println("var_int1 + var_int2 : )" + result);
		
		result = var_int1 - var_int2;
		System.out.println("var_int1 - var_int2 = " + result);
		
		result = var_int1 * var_int2;
		System.out.println("var_int1 * var_int2 = " + result);
		
		result = var_int1 / var_int2;
		System.out.println("var_int1 / var_int2 = " + result);
		
		result = var_int1 % var_int2;
		System.out.println("var_int1 % var_int2 = " + result);

	}

}
