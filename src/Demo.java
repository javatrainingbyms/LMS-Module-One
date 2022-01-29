
public class Demo {
	private int x, y;
	public Demo(int a, int b) {
		x=a; y=b;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	public void show() {
		int x=55;
		//System.out.println(x+","+y);
		System.out.println(this.x+","+this.y);
	}
	public static void main(String[] args) {
		Demo d1=new Demo(10,20);
		Demo d2=new Demo(10,20);
		Demo d3=d1;
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d1.equals(d2));
		/*
		Demo d1=new Demo(10,20);
		Demo d2=new Demo(30,40);
		d1.show();
		d2.show();
		*/
		/*
			Demo d1;
			new Demo(10,20);
			Demo d2=new Demo(30,40);
			Demo d3=d2;
			d1=d2;
			d1.show();
			d2.show();
			d3.show();
			System.out.println("________________________________________________");
			d1.x=15;
			d1.y=25;
			d1.show();
			d2.show();
			d3.show();
			System.out.println("________________________________________________");
			d1=new Demo(5,6);
			d2=d1;
			d1.show();
			d2.show();
			d3.show();
			System.out.println("________________________________________________");
			d3=new Demo(11,12);
			d1.show();
			d2.show();
			d3.show();
		*/
	}
}
