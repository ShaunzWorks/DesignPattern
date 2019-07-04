package com.shaunz.designpattern.flyweightpattern;

import java.util.HashMap;

import com.shaunz.designpattern.common.util.Logger;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();
	
	public static Shape getCircle(String color){
		Circle circle = (Circle)circleMap.get(color);
		if(circle == null){
			circle = new Circle(color);
			circleMap.put(color, circle);
			Logger.log("Creating circle of color : " + color);
		}
		return circle;
	}
}
