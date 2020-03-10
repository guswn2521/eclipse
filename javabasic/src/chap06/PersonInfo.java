package chap06;

public class PersonInfo {
	void showSleepingType(Person person) {
		person.showSleepStyle();
	}
	void showSleepingType(Person[] persons) {
		for(Person person : persons) {
			person.showSleepStyle();
		}
	}
}
