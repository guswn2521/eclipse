package chap08;

public class Student4 {
	String name;
	int number;
	public Student4(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {//obj == st4
		Student4 st = null;
		boolean b = false;
		if(obj instanceof Student4) {
			st = (Student4)obj;//st4
		}
		b = (st != null && st.name.equals(name)&&st.number == number);
		return b;
	}
}
