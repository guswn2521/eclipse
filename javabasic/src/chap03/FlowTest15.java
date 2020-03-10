package chap03;

public class FlowTest15 {

	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=0; i<=20; i++) {
//			if (i%2 != 0 && i%3 != 0) {
//				sum +=i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(sum);
		
		int sum = 0;
		int sum1 = 0;
		String a = "";
		for(int i = 1;i<=10; i++) {
			sum += i;
			sum1 += sum;
			System.out.println(sum1);
			a += (sum==1)? ""+sum : "+"+sum ;
		}
		System.out.println(a + "=" + sum1);
		
//		int sum = 0;
//		int s = 1;
//		
//		for(int i=1; true ;i++) {
//			if (i%2 ==0) {
//				s = -1;
//			}else {
//				s = 1;
//			}
//			sum = sum + (i*s);
//			System.out.println(sum);
//			
//			if(sum >= 100) {
//				break;
//			}
//			
//		}
//		System.out.println(sum);
		
		
	}

}
