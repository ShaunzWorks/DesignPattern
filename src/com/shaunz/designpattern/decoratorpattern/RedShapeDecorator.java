package com.shaunz.designpattern.decoratorpattern;

import com.shaunz.designpattern.common.util.Logger;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		super.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape){
		Logger.log("Border Color: Red");
	}
	
	

}
