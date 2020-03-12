package chap08;

public class ExceptionTest6 {
	public void exceptionMethod() throws Exception{
		throw new Exception();
	}//강제로 예외를 발생시킴
	public static void main(StringTest2[] args) {
		ExceptionTest6 et6 = new ExceptionTest6();
		try {
			et6.exceptionMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
