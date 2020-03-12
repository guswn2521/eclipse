package chap08;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
		String source1 = "111-111|강원도|춘천시|퇴계동";
		StringTokenizer st1 = new StringTokenizer(source1, "|");
		while(st1.hasMoreTokens()) {
			String zip = st1.nextToken();
//			String dou = st1.nextToken();
//			String si = st1.nextToken();
//			String dong = st1.nextToken();

			System.out.println(zip);
//			System.out.println(dou);
//			System.out.println(si);
//			System.out.println(dong);
		}

	}

}
