package chap07;

public class Marine extends GroundUnit {//보병
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	void stmpPack() {}//스킬

//	@Override
//	void move(int x, int y) {
//		System.out.printf("[%s,%s] Marine Move!%n",x, y);
//	}
	@Override
	public String toString() {
		return "Marine";
	}
	
}
