package chap07;

public class InterfaceTest2 {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.move();
		plane.fly();
		
		Flyable flyable = new Plane(); //다형성
		

	}

}
