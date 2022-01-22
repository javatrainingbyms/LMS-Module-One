
public class Account {
	private int ano;
	private String name;
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
	public void interest(int amount) {
		System.out.println("Interest : "+(amount*10/100));
	}
}
