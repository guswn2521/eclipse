package chap07;

public class AnonymousInnerTest {

	public static void main(String[] args) {
		CommndProcess cp = new CommndProcess();
		cp.process(new Command(){
			public void execute() {
				System.out.println("한번끝");
			}
		});

	}

}
