package in.com.rays;

public class Logic {
	public void sum() {
		
		System.out.println("sum method");
		
	}
	
	public String name() {
		return "rishendra";
	}
	
	public int HouseMemberAge() {
		int father = 40 ;
		int mother =30 ;
		int son =20 ;
		int daughter =10 ;
		int totalAge = father + mother + son + daughter;
		
		System.out.println("Total Age of Parents :: " + father+ " ** "+ mother);
		System.out.println("Total Age of Family :: " + (father + mother + son + daughter));
		return totalAge;
	}

	
}

