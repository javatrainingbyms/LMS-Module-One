package com.ms;

public class Mobile {

	private SIM sim;
	
	public void insertSIM(SIM sim) {
		this.sim=sim;
	}
	public void doCall() {
		sim.call();
	}
	public void doMessage() {
		sim.sms();
	}
	
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		//mobile.insertSIM(new AirtelSIM());
		mobile.insertSIM(new JioSIM());
		mobile.doCall();
		mobile.doMessage();
	}
}
