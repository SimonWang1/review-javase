package com.wsx.demo.chapter6;

public abstract class CarSpeedMeterAbs {
	// 速度抽象类
	// 封装转速
	private double turnRate;

	// 半径抽象方法
	public abstract double getRadius();

	// 转速set、get方法
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	
	public double getTrunRate() {
		return this.turnRate;
	}

	// 定义计算速度的通用算法
	public double getSpeed() {
		// 速度等于 2 * PI * 车轮半径 * 转速
		return 2 * Math.PI  * getRadius()* turnRate;
	}

	public CarSpeedMeterAbs() {

	}
}
