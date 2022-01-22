class Parent {
	void print() {
		System.out.println("parent is printing...");
	}
}

class Child extends Parent {
	 public void print() {
		System.out.println("child is printing...");
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		Child child=new Child();
		child.print();
		
	}
}
