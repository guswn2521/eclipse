package chap05;

public class House {
	int price;
	String dong;
	int size;
	String kind;

	public House() {
		//new House(100,"dong", 84, "apt")  문법적으로는 옳지만, 사실상 new를 사용하면 새로생성하는것(내 자신이 아님)
		this(100,"dong", 84, "apt"); //기본생성자에서 값들을 생성, 초기값 설정.
	}
	public House(int price) {
		this(price,"dong", 84, "apt"); //가격은 입력받으려면 나머지 값들을 초기화.
	}
	public House(int price, int size) {
		this(price,"dong",size,"apt");
	}
	
	public House(int price, String dong, int size, String kind) {
		this.price = price;
		this.dong = dong;
		this.size = size;
		this.kind = kind;
	}

}
