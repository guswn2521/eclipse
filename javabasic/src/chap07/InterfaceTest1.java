package chap07;

public class InterfaceTest1 {

	public static void main(String[] args) {
		Interface1Impl in1 = new Interface1Impl();
		System.out.println(in1.interVar);
		System.out.println(Interface1.interVar);
		in1.interface1Method();
		
		

	}

}
