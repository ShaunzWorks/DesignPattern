package com.shaunz.designpattern.abstractFactorypattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String colorType) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if("RECTANGLE".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		} else if ("CIRCLE".equalsIgnoreCase(shapeType)){
			return new Circle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}

}
