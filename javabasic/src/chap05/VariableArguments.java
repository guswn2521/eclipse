package chap05;

public class VariableArguments {

	void printInfo(String ...infos) {
		if(infos.length !=0) {
			for(int i=0;i<infos.length;i++) {
				System.out.print(infos[i]);
			}
			System.out.println();
		}else {
			System.out.println("infos not found.");
		}
	}
	
	public static void main(String[] args) {
		VariableArguments vt = new VariableArguments();
		vt.printInfo();
		vt.printInfo("aaa");
		vt.printInfo("aaa","bbb");
		vt.printInfo("aaa","bbb","ccc");
		
		

	}

}
