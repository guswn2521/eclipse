package chap05;

public class Boiler {
	String maker;
	int temp;
	String color;
	
	void tempUp() {
		temp++;
	}
	
	void tempUp(int amount) {
		temp = temp + amount;
	}
	
	public static void main(String[] args) {
		Boiler bo = new Boiler();
		
		bo.tempUp();
		System.out.println(bo.temp);
		bo.tempUp(20);
		System.out.println(bo.temp);
		
	}
}

