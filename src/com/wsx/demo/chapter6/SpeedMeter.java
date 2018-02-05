package com.wsx.demo.chapter6;

public abstract class SpeedMeter {
	// 转速
	private double turnRate;
	public SpeedMeter() {
		
	}
	// 把返回车轮半径的方法定义成抽象方法
	public abstract double getRadius();
	public void setTurnTate(double turnRate) {
		this.turnRate = turnRate;
	}
	// 定义计算速度的通用算法
	public double getSpeed() {
		//速度等于 车轮半径 * 2 * PI * 转速
		return Math.PI * 2 * getRadius() * turnRate;
	}
	
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
	
	public double getTrunRate() {
		return this.turnRate;
	}
}
