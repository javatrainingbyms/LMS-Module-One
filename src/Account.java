
public class Account {
	private int ano;
	private String name;
	private static final int INTEREST_RATE=10;
	int data=10;
	public void display() {
		System.out.println("Display From Parent..");
	}
	public void interest(int amount) {
		//interestRate=12;
		System.out.println("Interest : "+(amount*INTEREST_RATE/100));
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
