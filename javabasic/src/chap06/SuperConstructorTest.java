package chap06;

//import chap05.AirCon;

public class SuperConstructorTest {

	public static void main(String[] args) {
		
//	AirCon airCon = new AirCon();
		Sales2 sales2 = new Sales2("dh", "ddd",1, 2);
		System.out.println(sales2.displayInfo());
}
}