package chap02;

public class DataTypeTest {

	public static void main(String[] args) {
		// TODO boolean
		boolean var_boolean = true;
		
		//byte
		byte var_byte = 127;
		
		//short
		short var_short = 32767;
		
		//char
		char var_char1 = 66;
		char var_char2 = 'A';
		char var_char3 = '\u0041';
		char var_char4 = '가';
		
		
		//그 이상의 숫자들
		
		//int
		int var_int = 100000;
		int n = 1000000000;
		long m = 1000000000000L;
		
		System.out.println(m + n);
		
		//long
		long var_long = 1000000;
		
		//float
		float var_float = 3.14f;
		
		//double
		double var_double = 3.14;
		
		//출력
		System.out.println("var_boolean = " + var_boolean);
		System.out.println("var_byte = " + var_byte);
		System.out.println("var_short = " + var_short);
		System.out.println("var_char1 = " + (int)var_char1);
		System.out.println("var_char1 = " + var_char1);
		System.out.println("var_char2 = " + var_char2);
		System.out.println("var_char3 = " + var_char3);
		System.out.println("var_char4 = " + var_char4);
		System.out.println("var_int = " + var_int);
		System.out.println("var_long = " + var_long);
		System.out.println("var_float = " + var_float);
		System.out.println("var_double = " + var_double);
		

	}

}
