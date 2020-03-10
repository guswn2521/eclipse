package chap06;

public class ParameterPolyTest {

	public static void main(String[] args) {
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		pf.showSleepingType(person);
		pf.showSleepingType(president);
		pf.showSleepingType(student);
		pf.showSleepingType(employee);

	}

}
