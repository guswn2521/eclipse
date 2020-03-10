package chap07;

public class Circle extends Shape{
	Point center;  //포함관계
	int r ;
	
	public Circle() {//기본생성자
		this(new Point(), 100); //0,0위치 반지름 100.
	}

	public Circle(Point center, int r) { //오버로딩된 생성자
		super();
		this.center = center;
		this.r = r;
	}
	
	@Override
	void draw() {
		String s = "[center = (%s,%s), r = %s, color = %s]%n";
		System.out.printf(s, center.getX(), center.getY(), r, color);
	}
	
	
}
