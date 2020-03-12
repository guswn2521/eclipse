package test2;

public class MemVO {
	private int age;
	private String name;
	private String nation;
	
	public MemVO() {
	}

	public MemVO(int age, String name, String nation) {
		super();
		this.age = age;
		this.name = name;
		this.nation = nation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "MemVO [age=" + age + ", name=" + name + ", nation=" + nation + "]";
	}//MemVO[age=age, name=name, nation=nation]
	
}
