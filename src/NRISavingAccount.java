
public class NRISavingAccount extends SavingAccount {
	private String country;

	public void interest(int amount) {
		System.out.println("Interest : "+(amount*8/100));
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public static void main(String[] args) {
		NRISavingAccount nri=new NRISavingAccount();
		nri.setAno(2340);
		nri.setName("demo");
		nri.setNominee("test");
		nri.setBalance(545400);
		nri.interest(50000);
		String res=nri.toString();
		System.out.println(res);
	}
}
