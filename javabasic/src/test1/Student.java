package test1;

public class Student extends Person{
	private String schoolKind;
	private String grade;
	public String getSchoolKind() {
		return schoolKind;
	}
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public void showSleepStyle() {
		// TODO Auto-generated method stub
		super.showSleepStyle();
		System.out.println("학생들 규칙적");
	}
	public void study() {
		System.out.println("공부를 한다.");
	}

}

