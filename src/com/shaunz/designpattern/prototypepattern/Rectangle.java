package com.shaunz.designpattern.prototypepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		Logger.log("Inside Rectangle::draw() method.");
		
	}

}
