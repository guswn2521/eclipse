package chap08;

public class EnumTest1 {

	public static void main(String[] args) {
//		Student st1 = new Student(Student.ELEMENTARY);
//		Student st2 = new Student(2);//= Student.MIDDLE
		Student st1 = new Student(SchoolType.ELEMENTARY);
		Student st2 = new Student(SchoolType.MIDDLE);
		
		System.out.println("상수 값을 출력한 경우");
		System.out.println(SchoolType.ELEMENTARY);
		System.out.println(SchoolType.MIDDLE);
		
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("초딩");
		}
		if(st1.school == SchoolType.MIDDLE) {
		
		}
	}

}
