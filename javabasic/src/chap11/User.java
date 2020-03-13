package chap11;

import java.io.Serializable;

public class User implements Serializable{

	private String id;
	private String passwd;
	private String name;
	private String dong;
	private int age;
	
	public User() {

	}
	
	public User(String id, String passwd, String name, String dong, int age) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.dong = dong;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", passwd=" + passwd + ", name=" + name + ", dong=" + dong + ", age=" + age + "]";
	}
	
	
}
