package chap08;

public class StringTest2 {

	public static void main(java.lang.String[] args) {
		String orgString = new String("Java");
		String lastString = orgString.concat("Fighting!");
		System.out.println(orgString == lastString);
		
		StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb2 = sb.append("Fiighting.");
		System.out.println(sb == sb2);

	}

}
