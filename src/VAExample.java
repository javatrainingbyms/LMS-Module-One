
public class VAExample {

	public static void add(int x, int y) {
		System.out.println("Addition of 2 : "+(x+y));
	}
	public static void add(int... v) {
		int sum=0;
		for(int i=0; i<v.length; i++) {
			sum=sum+v[i];
		}
		System.out.println("Sum : "+sum);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(10,20,30,40,50);
		
	}
	

}
/*
 	1) only one varargs per method.
 	2) non-varargs can be taken with vargs
 	3) varargs must be on last position.
 	4) if there is an exact match and varargs both available, pref will be given to exact match.

*/
