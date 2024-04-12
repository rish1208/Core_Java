
package in.com.rays;

public class TestLogic {
	public static void main(String[] args) {
		
		Logic logicObj= new Logic();
		
		logicObj.sum();
		logicObj.HouseMemberAge();
		logicObj.name();
		
		String s= logicObj.name();
		
		System.out.println(s);
		System.out.println(" total age = " + logicObj.HouseMemberAge());
		
		Shape shapeObj = new Shape("yellow",20);
		System.out.println("color :: " + shapeObj.getColor());
		System.out.println("borderwidth :: " + shapeObj.getBorderwidth());
		
		shapeObj.setColor("green");
		shapeObj.setBorderwidth(55);
		
		Shape shapeObj1 = new Shape();
		shapeObj1.setColor("orange");
		shapeObj1.setBorderwidth(44);
		
		System.out.println("color :: " + shapeObj1.getColor());
		System.out.println("borderwidth :: " + shapeObj1.getBorderwidth());
		
		System.out.println("color :: " + shapeObj.getColor());
		System.out.println("borderwidth :: " + shapeObj.getBorderwidth());
		
		
	}
	
	
	
	

}
