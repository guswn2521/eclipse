package chap07;

public class AbstractTest3 {

	public static void main(String[] args) {
		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		//Vehicle vCar = new Car();
		Vehicle vCar = car;  //다형성, 부모이름으로 자식 참조 ,이미 만들어놓아서 위와 같음
		Vehicle vShip = new Ship(); //부모 Vehicle
		Vehicle vPlane = new Plane();
		
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(vCar);
		vUse.getMoveStyle(vPlane);
		vUse.getMoveStyle(vShip);

	}

}
