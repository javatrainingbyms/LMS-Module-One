
public class SavingAccount extends Account {
	private int balance;
	private String nominee;
	int data=50;
	
	public void display() {
		System.out.println("Display From Child..");
	}
	public void showData() {
		//System.out.println(data);
		//System.out.println(super.data);
		display();
		super.display();
	}
	@Override
	public String toString() {
		String info=getAno()+","+getName()+","+balance+","+nominee;
		return info;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount();
		savingAccount.showData();
		/*
		savingAccount.setAno(10001);
		savingAccount.setName("abc");
		savingAccount.setBalance(50000);
		savingAccount.setNominee("xyz");
		System.out.println(savingAccount.getAno());
		System.out.println(savingAccount.getName());
		System.out.println(savingAccount.getBalance());
		System.out.println(savingAccount.getNominee());
		savingAccount.interest(50000);
		//String info=savingAccount.toString();
		System.out.println(savingAccount);
		*/
	}
}
