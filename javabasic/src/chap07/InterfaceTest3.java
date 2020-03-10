package chap07;

public class InterfaceTest3 {

	public static void main(String[] args) {
		In1Impl in1Impl = new In1Impl(); //날다
		In2Impl in2Impl = new In2Impl(); //걷다, 뛰다
		In3Impl in3Impl = new In3Impl(); //날다, 걷다  method1이 이름만 같고 내용은 다를 수 있음.
		in3Impl.in1Method();
		in3Impl.in2Method();
		in1Impl.in1Method();
		in2Impl.in1Method();
		in2Impl.in2Method();
		int x1 = In1.x ;
		int x2 = In2.x;

	}

}
