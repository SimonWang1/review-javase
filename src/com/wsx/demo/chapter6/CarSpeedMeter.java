package com.wsx.demo.chapter6;

public class CarSpeedMeter extends CarSpeedMeterAbs{
	// 实现抽象类，重写抽象方法实现功能
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter();
		// 转速赋值
		csm.setTurnRate(15);
		// 输出速度
		System.out.println(Math.round(csm.getSpeed()));
	}
	
	// 重写半径方法
	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0.26;
	}
}
