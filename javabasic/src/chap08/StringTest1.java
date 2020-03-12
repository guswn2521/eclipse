package chap08;

public class StringTest1 {

	public static void main(StringTest2[] args) {
		String string1 = "testString";
		String string2 = "testString";
		
		System.out.println(string1.equals(string2));
		System.out.println(string1 == string2);//참조변수의 값을 비교할 때 : 주소1 == 주소2
		//true
		
		String string3 = new String("testString");
		String string4 = new String("testString");
		
		System.out.println(string1.contentEquals(string3));
		System.out.println(string1==string4);
	}

}
