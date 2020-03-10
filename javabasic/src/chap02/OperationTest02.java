package chap02;

public class OperationTest02 {
	// total avg
	public static void main(String[] args) {
		
		int total = 0;
		int avg = 0;
		
		String args1 = args[0];
		String args2 = args[1];
		String args3 = args[2];
		String args4 = args[3];
				
		int kor = Integer.parseInt(args1);
		int mat = Integer.parseInt(args2);
		int eng = Integer.parseInt(args3);
		int des = Integer.parseInt(args4);
		
		total = kor + mat + eng + des;
		avg = total / args.length;
		
		System.out.printf("총점 = %s%n평균 = %s%n", total, avg);
		

	}

}
