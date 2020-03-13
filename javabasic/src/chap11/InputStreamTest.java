package chap11;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int var_byte  = -1;
		System.out.println("문자입력 : ");
		while(true) {
			try {
				var_byte = System.in.read();//1byte씩 읽음 -> 한글깨짐
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if(var_byte ==10 || var_byte ==13) {
				break;
			}else {
				System.out.println("char : "+(char)var_byte);
			}
			
		}
		System.out.println("end");
		
		
	}

}
