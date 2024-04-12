package in.com.poly;

public class Shape {
	private int borderWidth;
	private String color;

//	public Shape() {
//		System.out.println("Defalt constructure shape");
//	}

	/*
	 * public Shape(int borderWith, String color) { this.borderWidth = borderWith;
	 * this.color = color; }
	 */

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public void area() {
		System.out.println("area shape");
	}

}
