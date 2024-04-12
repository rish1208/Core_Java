package im.com.OOP;

public class Rectangle extends Shape{
	
private int length;
private int width;

public void setlength(int length) {
	this.length=length;
}
	public int getlength() {
		return length;
	}
		
	public void setwidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
		
	}
	
	public void area() {
		int area=getlength() * getWidth();
		System.out.println("Rectangle area = " + area);
	}
}



