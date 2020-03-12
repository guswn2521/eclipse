package chap08;

public class ExceptionEx05 {
	public static void main(StringTest2[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);//exception이후 바로 catch로 감.
			System.out.println(4);
		}catch (ArithmeticException e) {//오류먼지 찾아서
			System.out.println(e.getMessage());
			System.out.println("5-1");
		} 
		catch (Exception e) {//무슨 오류인지 모를때, 처음일치한 exception만 실행하므로 남용x
			System.out.println(5);
		}
		finally {
			System.out.println("무조건 실행");
		}
		System.out.println(6);
	}
}
