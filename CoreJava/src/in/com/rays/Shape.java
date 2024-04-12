package in.com.rays;

public class Shape {
	private String color = null;
	private int borderwidth = 0;
	
	public Shape() {
		
	}
	public Shape(String color,int borderwidth) {
		this.color = color;
		this.borderwidth = borderwidth;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	
	
	
}
