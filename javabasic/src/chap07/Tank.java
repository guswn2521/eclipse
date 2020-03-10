package chap07;

public class Tank extends GroundUnit implements Repairable{
	
	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	void changeMode() {}
	
	@Override
	public String toString() {
		return "Tank";
	}

//	@Override
//	void move(int x, int y) {
//		System.out.printf("[%s,%s] Tank Move!%n",x, y);
//		
//	}
}
