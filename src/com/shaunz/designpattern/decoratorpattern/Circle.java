package com.shaunz.designpattern.decoratorpattern;

import com.shaunz.designpattern.common.util.Logger;

public class Circle implements Shape{

	@Override
	public void draw() {
		Logger.log("Shape: Circle");
	}

}
