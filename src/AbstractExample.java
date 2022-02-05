abstract class A {
	void m1() {System.out.println("m1 of parent");}
	void m2() {System.out.println("m2 of parent");}
	abstract void m3();
	abstract void m4();
}
class B extends A {
	
	@Override
	void m3() {System.out.println("m3 of child");}

	@Override
	void m4() {System.out.println("m4 of C");}
	
}

public class AbstractExample {
	public static void main(String[] args) {
		//A ob=new A();
		A ob;
		
		
		
	}
}
