package com.shaunz.designpattern.facadepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		Logger.log("Rectangle::draw()");
	}

}
