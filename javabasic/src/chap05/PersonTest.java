package chap05;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1.age);
		int age = 10;
		Person person2 = new Person(age);
		System.out.println(person2.age);
		System.out.println(person2.name);
		String n = "ddd";
		int a = 1;
		Person person3 = new Person(a, n);
		System.out.println(person3.age);
		System.out.println(person3.name);

	}

}
