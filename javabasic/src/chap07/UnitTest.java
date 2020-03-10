package chap07;

public class UnitTest {

	public static void main(String[] args) {
		Repairable tank = new Tank();
		Repairable dropship = new Dropship();
		//Marine marine = new Marine();
		SCV scv = new SCV();//Repairable되면 안됨. scv의 메소드사용해야함.
		
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
		//scv.repair(marine);

	}

}
