package chap05;

public class Args {
	
	int x;
	
	void add(int x) {
		x = x+5;		
	}
	void add(Args a) {
		a.x = a.x + 40;
	}
	
	void add(int[] arr) {
		arr[0]++;
	}
	
	void addNew(Args a) {
		System.out.println("1" + a);
		a = new Args();
		System.out.println("2" + a);
	}
	
	

}
