
public class Trainee {
	private int code;
	private String name;
	private String desg;
	private int marks;
	private static int passed;
	private static int failed;
	
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