package in.com.poly;

public class TestShape {
	public static void main(String[] args) {
	Shape[] s=new Shape[3];
		s[0]=new Rectangle(12,12);
		s[1]=new Circle(15);
		s[2]= new Triangle(14,16);
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		
			
		}
//		Shape[] s=new Shape[2];
//		s[0]= new Rectangle();
//		s[1]= new Circle();
//		Rectangle r=(Rectangle) s[0];
//		r.setlength(2);
//		r.setWigth(3);
//		Circle c=(Circle) s[1];
//		c.setRadius(3);
//		for (int i = 0; i < s.length; i++) {
//			s[i].area();
//		}
	}

}
