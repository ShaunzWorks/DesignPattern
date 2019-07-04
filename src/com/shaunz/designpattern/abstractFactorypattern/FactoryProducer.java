package com.shaunz.designpattern.abstractFactorypattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if("COLOR".equalsIgnoreCase(choice)){
			return new ColorFactory();
		} else if ("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}
		return null;
	}
}
