package chap02;

public class VarChangeTest {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
		String pt = "x + y :";
		
		System.out.println(pt + x + y);
		System.out.println("x:"+ x +" "+ "y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		
		System.out.println("x : " + x +" " + "y: " + y);

	}

}
