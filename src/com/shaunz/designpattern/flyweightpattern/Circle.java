package com.shaunz.designpattern.flyweightpattern;

import com.shaunz.designpattern.common.util.Logger;

public class Circle implements Shape{
	
	private String color;
	private int x;
	private int y;
	private int radius;
	
	public Circle(String color){
		this.color = color;
	}
	
	@Override
	public void draw() {
		Logger.log("Circle: Draw() [Color : " + color
				+", x : " + x +", y :" + y +", radius :" + radius);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
