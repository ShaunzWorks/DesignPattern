package com.shaunz.designpattern.facadepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Square implements Shape{

	@Override
	public void draw() {
		Logger.log("Square::draw()");
	}

}
