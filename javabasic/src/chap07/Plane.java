package chap07;

public class Plane extends Vehicle implements Flyable{
	
	void move() {
		System.out.println("Plane - 활주로");
		
	}
	
	public void fly() {
		System.out.println("fly 하늘");
	};
}
