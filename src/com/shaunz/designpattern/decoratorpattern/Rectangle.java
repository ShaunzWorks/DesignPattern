package com.shaunz.designpattern.decoratorpattern;

import com.shaunz.designpattern.common.util.Logger;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		Logger.log("Shape: Rectangle");
	}

}
