package chap08;

public class ExceptionTest7 {

	public static void main(String[] args) {
		try {
			if(args.length !=2) {
				String s = "인자 2개를 넣어주세요";
				ArgsException ae = new ArgsException(s);
				ae.setArgsNumber(args.length);
				throw ae;
			}else {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
			}
		} catch (ArgsException e) {
			System.out.println(e.getMessage());
			System.out.println("인자수 : " + e.getArgsNumber());
		}
		
		
	}

}
