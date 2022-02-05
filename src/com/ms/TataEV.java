package com.ms;

public class TataEV {

	private Battery battery;
	
	public void insertBattery(Battery battery) {
		this.battery=battery;
	}
	public void drive() {
		battery.provideCurrent();
	}
	public static void main(String argrs[]) {
		TataEV ev=new TataEV();
		ev.insertBattery(new ExideBattery());
		//ev.insertBattery(new LuminousBattery());
		ev.drive();
	}
}
