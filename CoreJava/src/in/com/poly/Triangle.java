package in.com.poly;

public class Triangle extends Shape {
	private int height;
	private int base;
	
//	public Triangle() {
//		System.out.println("Triangle constructre");
//	}
	public Triangle(int height, int base) {
		this.base=base;
		this.height=height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getHeight() {
		return height;
	}
	public void setBase(int base) {
		this.base=base;
	}
	public int getBase() {
		return base;
	}
	public void area() {
		int area= (base*height)/2;
		System.out.println(area);
	}
}
