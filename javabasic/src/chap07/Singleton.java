package chap07;

final class Singleton {//상속 못받게함.
	private static Singleton s = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
	
	public void getName() {
		System.out.println("My name is Singleton");
	}
}
