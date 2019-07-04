package com.shaunz.designpattern.prototypepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Circle extends Shape{

	public Circle() {
		type = "Circle";
	}
	@Override
	void draw() {
		Logger.log("Inside Circle::draw() method.");
	}

}
