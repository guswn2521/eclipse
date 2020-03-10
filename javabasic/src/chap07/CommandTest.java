package chap07;

public class CommandTest {

	public static void main(String[] args) {
		CommndProcess cp = new CommndProcess();
		Command command = new WriteCommand();
		cp.process(command);
		command = new ListCommand();
		cp.process(command);
	}

}
