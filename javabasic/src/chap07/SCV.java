package chap07;

public class SCV extends GroundUnit implements Repairable{
	
	public SCV() {
		super(60);
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint ++;
			}
			System.out.println(u + " 수리 완료!!");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
	
	
}
