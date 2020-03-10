package chap05;

public class HouseTest {

	public static void main(String[] args) {
		House house = new House(500,100);
		System.out.println(house.size);
		
		House house2 = new House(300,200);
		System.out.println(house2.size);
		System.out.println(house2.price);
		System.out.println(house2.dong);
		System.out.println(house2.kind);

	}

}
