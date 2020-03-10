package chap07;

public class DrawShape {

	public static void main(String[] args) {
		Point center = new Point(150, 150);
		int r = 50;
		Circle c = new Circle(center, r);
		c.draw();
		
		Point[] p = {
				new Point(100,100),
				new Point(140,40),
				new Point(200, 100)
		};
		
		Triangle t = new Triangle(p);
		t.draw();

	}

}
