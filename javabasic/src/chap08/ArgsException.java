package chap08;

public class ArgsException extends Exception{//exception상속받아서 argsException이 예외가됨
	private int argsNumber; //private이면 getter setter

	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	public ArgsException(String msg) {
		super(msg);
	}
	
}
