package com.shaunz.designpattern.abstractFactorypattern;

public class ColorFactory extends AbstractFactory{

	@Override
	Color getColor(String colorType) {
		if("RED".equalsIgnoreCase(colorType)){
			return new Red();
		} else if ("BLUE".equalsIgnoreCase(colorType)) {
			return new Blue();
		} else if ("GREEN".equalsIgnoreCase(colorType)) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		return null;
	}
	
}
