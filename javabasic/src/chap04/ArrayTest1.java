package chap04;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		//배열 선언
		int[] ages ;
		String[] names;
		
		//배열 객체 생성, 갯수지정
		ages = new int[3];
		names = new String[3];
		
		//초기화
		ages[0] = 1;
		ages[1] = 2;
		ages[2] = 3;
		names[0] = "홍길동";
		names[1] = "이순신";
		names[2] = "세종대왕";
		
		//int[] ages = {1, 2, 3};
		//String[] names = {"홍길동","이순신"};
		
		//값 출력
		for(int i =0;i<3;i++) {
			System.out.println("ages[" + i + "] = " + ages[i]);
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println(Arrays.toString(ages));
		System.out.println(Arrays.toString(names));
		
		//배열의 length 속성 사용 테스트
		int num = 3;
		int [] array1 = new int[3];
		
		for(int i=0;i<array1.length;i++) {
			array1[i] = num++;
		}
		
		for(int i=0; i<array1.length;i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		System.out.println(Arrays.toString(array1));
		
		
				

	}

}
