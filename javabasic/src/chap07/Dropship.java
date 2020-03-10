package chap07;

public class Dropship extends AirUnit implements Repairable{
	
	public Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	void load() {} //수송선기능 승선
	void unload() {}//하선
	
	
//	@Override
//	void move(int x, int y) {
//		System.out.printf("[%s,%s] Dropship Move!%n",x, y);
//		
//	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
