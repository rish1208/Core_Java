package in.com.Inter;

public class Businessman implements Richman, Socialwork {

	@Override
	public void earnmoney() {
		System.out.println("earn more money");
		
	}

	@Override
	public void donetion() {
		System.out.println("donet extra money");
		
	}

	@Override
	public void party() {
		System.out.println("party is going on");
		
	}

	@Override
	public void helptoother() {
		System.out.println("need help");
		
	}

}
