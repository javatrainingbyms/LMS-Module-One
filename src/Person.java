
public class Person {
	private String fname;
	private String lname;
	
	
	public Person() {
		super();
	}
	public Person(String s1, String s2) {
		super();
		fname = s1;
		lname = s2;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void info() {
		System.out.println(fname+","+lname);
	}
	public static void main(String[] args) {
		//Person p=new Person("manish","jain");
		Person p=new Person();
		p.setFname("abc");
		p.info();
	}
}
