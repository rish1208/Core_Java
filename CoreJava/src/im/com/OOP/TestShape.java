package im.com.OOP;

public class TestShape {
	public static void main(String[] args) {
		Shape s= new Shape();
		s.setColor("Red");
		s.setLength(20);
		s.setWidth(15);
		System.out.println(s.getColor());
		System.out.println(s.getLength());
		System.out.println(s.getWidth());
		
		Rectangle r= new Rectangle();
		r.setwidth(12);
		r.setlength(14);
		System.out.println(r.getlength());
		System.out.println(r.getWidth());
		
		Triangle t=new Triangle();
		t.setBase(18);
		t.setHeight(17);
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
	}

}
