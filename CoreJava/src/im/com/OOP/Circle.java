package im.com.OOP;

public class Circle extends Shape {
	private int radius;
	private double PI=3.14;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
    public int getRadius() {
    	return radius;
    }
    public void setPI(double pi) {
    	this.PI=pi;
    }
    public double getPI() {
    	return PI;
    }
    public void area() {
    	double area=  PI*getRadius()* getRadius();
    }
    
}
