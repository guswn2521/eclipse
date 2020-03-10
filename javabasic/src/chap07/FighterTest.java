package chap07;

public class FighterTest {

	public static void main(String[] args) {
		//instanceof
		//Object, Unit, Fightable(Moveable,Attackable)
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {//f 가 Unit?
			System.out.println("Unit으로 형변환가능");
		}
		if(f instanceof Fightable) {//f 가 Fightable?
			System.out.println("Fightable로 형변환가능");
		}
		if(f instanceof Moveable) {//f 가 Moveable?
			System.out.println("Moveable로 형변환가능");
		}
		if(f instanceof Attackable) {//f 가 Attackable?
			System.out.println("Attackable로 형변환가능");
		}
		if(f instanceof Object) {//f 가Object?
			System.out.println("Object로 형변환가능");
		}
		//object, Unit, interface 다 부모형이 될 수 있음. 다 fighter를 참조가능

	}

}
