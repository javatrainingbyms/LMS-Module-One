
public class Trainee {
	private int code;
	private String name;
	private String desg;
	private int marks;
	private static int passed;
	private static int failed;
	
	public static void showAvg(Trainee... t) {
		int n=t.length;
		int total=0;
		for(int i=0; i<n; i++) {
			total=total+t[i].marks;
		}
		System.out.println("Avg Marks For "+n+" : "+total/n);
	}
	/*
	public static void showAvg(Trainee trainee1, Trainee trainee2, Trainee trainee3, Trainee trainee4) {
		System.out.println("Avg of 4 : "+(trainee1.marks+trainee2.marks+trainee3.marks+trainee4.marks)/4);
	}
	public static void showAvg(Trainee trainee1, Trainee trainee2, Trainee trainee3) {
		System.out.println("Avg of 3 : "+(trainee1.marks+trainee2.marks+trainee3.marks)/3);
	}
	
	public static void showAvg(Trainee trainee1, Trainee trainee2) {
		System.out.println("Avg of 2 : "+(trainee1.marks+trainee2.marks)/2);
	}
	*/
	
	
	
	public void showMarks() {
		System.out.println("Marks Scored : "+marks);
	}
		
	public static void summary() {
		System.out.println("Total Passed : "+passed);
		System.out.println("Total Failed : "+failed);
		System.out.println("-----------------------------------------------------");
	}
	public void report() {
		System.out.println("Code  : "+code);
		System.out.println("Name  : "+name);
		System.out.println("Desg  : "+desg);
		System.out.println("Marks : "+marks);
		if(marks>=50) {
			System.out.println("Assessment Cleared...!");
			passed++;
		}else {
			System.out.println("Assessment Not Cleared...!");
			failed++;
		}
		System.out.println("____________________________________________________");
	}
	
	public  void setData(int a, String b, String c, int d) {
		code=a; 
		name=b;
		desg=c;
		marks=d;
	}
	
}

/*
  any instance variable you are using inside a non-static method always belongs to calling object.
      
    
*/