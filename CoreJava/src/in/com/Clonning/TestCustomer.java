package in.com.Clonning;

public class TestCustomer {
	public static void main(String[]args) throws CloneNotSupportedException {
		Customer c1=new Customer("rrrr", 1000);
		Customer c2= (Customer)c1.clone();
		c2.name="Ram";
		c2.acc.balance=5000;
		System.out.println(c1.name);
		System.out.println(c1.acc.balance);
		System.out.println(c2.name);
		System.out.println(c2.acc.balance);
	}

}
