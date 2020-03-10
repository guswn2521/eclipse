package chap06;

public class ExtendsTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(parent.parentVar);
		parent.parentMethod();
		
		Child child = new Child();
		System.out.println(child.parentVar);
		child.parentMethod();
		System.out.println(child.childVar);
		child.childMethod();

	}

}
