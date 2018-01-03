package com.wsx.demo.chapter6;

public class CarSpeedMeter extends SpeedMeter{
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
	
	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0.26;
	}
}
