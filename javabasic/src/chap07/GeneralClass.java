package chap07;

public class GeneralClass extends AbClass2{
	void abMethod2() {
		System.out.println("abMethod2 Override");
	}
	
	void abMethod1() {
		System.out.println("abMethod1 Override");
	}
	//부모, 조부모 구현 2개
	//실제 사용은 general 상속받아서사용

}
