class X {
	
	X(){
		System.out.println("X0");
	}
	
	X(int p){
		System.out.println("X1");
	}
	X(int p, int q){
		System.out.println("X2");
	}
}
class Y extends X {
	Y(){
		super(1);
		System.out.println("Y0");
	}
	Y(int p){
		super(1,2);
		System.out.println("Y1");
	}
	Y(int p, int q){
		System.out.println("Y2");
	}
}
public class SuperExample {

	public static void main(String[] args) {
		
		//Y ob1=new Y(); //zero arg		(parent class zero)
		//Y ob2=new Y(1); //one int arg   (parent class zero)
		Y ob3=new Y(1,2);//two int args (parent class zero)
		

	}

}
