package com.shaunz.designpattern.prototypepattern;

import com.shaunz.designpattern.common.util.Logger;

public class Square extends Shape{
	public Square(){
		type = "Square"; 
	}

	@Override
	void draw() {
		Logger.log("Inside Square::draw() method.");
	}
	
}
