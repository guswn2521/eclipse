package test1;

public class Stu {
	String name;
	int ban;
	int no;
	int kor, eng, math;
	public Stu() {
		// TODO Auto-generated constructor stub
	}
	
	public Stu(String name, int ban, int no, int kro, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ "]";
	}
	
}
