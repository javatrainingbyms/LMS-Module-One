
public class CurrentAccount extends Account {
	private String company;
	private int balance;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		CurrentAccount ca=new CurrentAccount();
		ca.setAno(50001);
		ca.setName("ppp");
		ca.setCompany("xyz ltd.");
		ca.setBalance(523000);
		System.out.println(ca.getAno()+","+ca.getName()+","+ca.getBalance()+","+ca.getCompany());
		ca.interest(50000);
	}
	
}
