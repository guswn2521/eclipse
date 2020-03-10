package chap05;

public class VariableKind {

	int memVar; // 인스턴스변수
	static int staticVar; // static변수
	
	public static void main(String[] args) {
		int localVar; //지역변수
		
		VariableKind vk1 = new VariableKind();//생성자메소드
		System.out.println(vk1.memVar);
		System.out.println(vk1.staticVar);
		System.out.println(VariableKind.staticVar);
		
		VariableKind vk2 = new VariableKind();
		vk1.staticVar = 20;
		System.out.println(vk2.staticVar);
		System.out.println(VariableKind.staticVar);
		
		Test test = new Test();
		int sum = test.add(3,5);
		
	}

}
