package chap08;

public class AutoBoxingTest {

	public static void main(String[] args) {
		//jdk1.4
		int intVar = 3;
		Integer intObj = new Integer(intVar); //기본형을 객체로
		
		//오토 박싱
		intObj = intVar;
		
		//jdk1.4
		Integer intObj2 = new Integer("1");
		int intVar2 = intObj2.intValue();
		
		//오토 언박싱
		intVar2 = intObj2;
		
	}

}
