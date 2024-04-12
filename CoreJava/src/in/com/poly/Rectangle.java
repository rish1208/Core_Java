package in.com.poly;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle() {
		System.out.println("Rectangle constracter");
	}
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	public void setlength(int length) {
		this.length=length;
	}
   public int getlength() {
	   return length;
   }
   public void setWigth(int width) {
		this.width=width;
	}
  public int getwidth() {
	   return width;
}
  public void area() {
	  int area= length*width;
	  System.out.println("Rectanglr area =" + area);
  }
}
