package in.com.poly;

public class Circle extends Shape{
	private int radius;
	public Circle() {
		System.out.println("Circle constructer");
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	public void setRadius(int radius) {
		this.radius=radius;
	}
	public void area() {
		double area= 3.15*radius*radius;
		System.out.println("circle area=" + area);
	}
  
}
