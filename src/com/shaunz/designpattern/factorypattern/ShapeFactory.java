package com.shaunz.designpattern.factorypattern;

public class ShapeFactory {
	private static ShapeFactory shapeFactory;
	//private ShapeFactory(){}
	/*
	public static ShapeFactory getInstance(){
		if(shapeFactory == null)
			shapeFactory = new ShapeFactory();
		return shapeFactory;
	}*/
	
	public Shape getShape(String shapeType){
		if(shapeType == null || "".equals(shapeType.trim())){
			return null;
		}
		if("CIRCLE".equalsIgnoreCase(shapeType)){
			return new Circle();
		} else if("RECTANGLE".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		} else if("SQUARE".equalsIgnoreCase(shapeType)){
			return new Square();
		} else {
			return null;
		}
	}
}
