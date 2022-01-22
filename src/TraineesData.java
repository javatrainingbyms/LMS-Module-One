
public class TraineesData {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		Trainee t2=new Trainee();
		Trainee t3=new Trainee();
		Trainee t4=new Trainee();
	
		t1.setData(111,"AAA","SE",90);
		t2.setData(112,"BBB","SSE",60);
		t3.setData(113,"CCC","TL",30);
		t4.setData(114, "DDD", "TL", 60);

		Trainee.showAvg(t1, t2);	//{t1,t2}
		Trainee.showAvg(t1, t2, t3); //{t1,t2,t3}
		Trainee.showAvg(t1, t2, t3, t4);
		
		
		/*
		t1.showAvg(t2);
		t2.showAvg(t3);
		t3.showAvg(t1);
		*/
		/*
		Trainee.showMarks(t1);
		Trainee.showMarks(t2);
		Trainee.showMarks(t3);
		*/
		/*t1.showMarks();
		t2.showMarks();
		t3.showMarks();*/
		/*
		t1.report();
		t2.report();
		t3.report();
		
		Trainee.summary();
		*/
	}

}
