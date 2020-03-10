package chap05;

public class AirConTest {

	public static void main(String[] args) {
		AirCon airCon = new AirCon();
		
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price = 10000;
		
		airCon.tempUp();
		
		AirCon airCon2 = new AirCon();
		System.out.println(airCon2.color);
		System.out.println(airCon2.price);
		
		airCon2 = airCon; //airCon의 주소를 aircon2에 넣음.
		
		System.out.println(airCon2.color);
		System.out.println(airCon2.price);
		
	}

}
