package chap05;

public class InitBlock {
	int num;
	String str;
	
	static {//class로딩시 한번 실행
		System.out.println("static initblock");
	}
	
	{//인스턴스 block, 생성자 x호출시 마다 실행.
		System.out.println("생성자 init block");
	}
	
	public InitBlock() {
		// 생성자
//		num = 1;
//		str = "abc";
		this(1,"abc");
	}
	
	public InitBlock(int num, String str) {
		this.num = num;
		this.str = str;
	}
}
