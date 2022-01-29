
public class Customer extends Person {
	private String customerType;
	
	public void info() {
		//System.out.println(fname+","+lname);
		super.info();
		System.out.println(customerType);
	}
	public Customer(String s1, String s2, String s3) {
		super(s1,s2);
		customerType=s3;
	}
	
	public static void main(String[] args) {
		Customer c=new Customer("raj","sharma","regular");
		c.info();
	}
}
