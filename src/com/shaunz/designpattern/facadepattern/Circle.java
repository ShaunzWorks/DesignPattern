package com.shaunz.designpattern.facadepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Circle implements Shape{

	@Override
	public void draw() {
		Logger.log("Circle::draw()");
	}

}
