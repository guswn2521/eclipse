package chap07;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}//constructor using fields.
		
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	String getXY() {
		return "(" + x + "," + y + ")";
	}
	
	
	
}
