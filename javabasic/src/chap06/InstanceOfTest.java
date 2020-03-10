package chap06;

public class InstanceOfTest {
	public static void main(String[] args) {
		President president = new President();
		Person person1 = president;
		if(person1 instanceof President) {
			President president2 = (President)person1;
			System.out.println("person1 casting 성공");
		}else {
			System.out.println("person1 casting 불가");
		}
		Person person2 = new Person();
		if(person2 instanceof President) {
			President president2 = (President)person1;
			System.out.println("person2 casting 성공");
		}else {
			System.out.println("person2 casting 불가");
		}
	}
}
