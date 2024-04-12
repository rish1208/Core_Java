package in.com.Clonning;

public class Customer implements Cloneable {
	String name=null;
	Account acc=new Account();
	
	public Customer(String name, int bal) {
		this.name=name;
		this.acc.balance=bal;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	Customer c=(Customer) super.clone();
	c.acc=(Account)acc.clone();
	//return super.clone();
	return c;
}
}
