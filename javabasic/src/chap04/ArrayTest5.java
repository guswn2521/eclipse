package chap04;

public class ArrayTest5 {

	public static void main(String[] args) {
		String names[] = {"홍길동","전우치","이도","세종대왕","이민지","이나라","이민수"};
		for(String name : names) {
			System.out.println(name);
		}
		//개선된 for 문 과 같음
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		}
		
		

	}

}
