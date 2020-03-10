package chap05;

public class AirCon {
	String company;
	String color;
	int price;
	int size;
	int temp;
	
	//메소드
	void powerOn() {
		System.out.println("power on");
	}
	void powerOff() {
		System.out.println("power off");
	}
	void tempUp() {
		temp++;
	}
	void tempDown() {
		temp--;
	}
	

}
