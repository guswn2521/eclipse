package chap02;

public class OperatorTest07 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		//Math.round() : double형을 넣어서 long형을 return
		
		
		System.out.println(shortPi);
		

	}

}
