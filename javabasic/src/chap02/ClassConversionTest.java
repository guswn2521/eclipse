package chap02;

public class ClassConversionTest {

	public static void main(String[] args) {
		
		// #1 자동형변환
		byte var_byte1 = 10;
		int var_int1 = var_byte1; //int보다 작으므로 자동형변환
		int var_int2 = (int)var_byte1; //위와 같은 결과
		
		//#2 int를 byte로 변환 : (byte)
		int var_byte2 = 20;
		byte var_int3 = (byte)var_byte2;
		
		// #3 char를 short로 변환 : (char)
		short var_short1 = 200;
		char var_char1 = (char)var_short1;
		System.out.println(var_char1);
		
		
		byte b1 = 20;
		byte b2 = 40;
		//byte rs = b1 + b2;  연산을 하면 int로 바뀜
		int rs = b1 + b2;
		byte rs1 = (byte)(b1 + b2);
		
		//#5 다른 형끼리 연산 : 큰 형에 맞춰짐
		int i = 100;
		long l = 100;
		long rs3 = i + l;
		
		
		
		
		
		
		

	}

}
