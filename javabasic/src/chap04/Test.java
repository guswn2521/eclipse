package chap04;

public class Test {
	void printInfo(String...infos) {
		if(infos.length !=0) {
			for(int i=0;i<infos.length;i++) {
				System.out.println(infos);
			}
		}else {
			System.out.println("not found");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
