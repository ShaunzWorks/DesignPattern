package com.shaunz.designpattern.flyweightpattern;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. 
 * This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus 
 * improving the object structure of application.Flyweight pattern tries to reuse already existing similar kind objects by storing 
 * them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 
 * 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check 
 * already existing Circle objects.
 * <b>Implementation</b>
 * We are going to create a Shape interface and concrete class Circle implementing the Shape interface. 
 * A factory class ShapeFactory is defined as a next step.ShapeFactory has a HashMap of Circle having key as color of the Circle object. 
 * Whenever a request comes to create a circle of particular color to ShapeFactory, 
 * it checks the circle object in its HashMap. If object of Circle is found, that object is returned otherwise a new object is created, 
 * stored in hashmap for future use, and returned to client.
 * FlyWeightPatternDemo, our demo class, will use ShapeFactory to get a Shape object. 
 * It will pass information (red / green / blue/ black / white) to ShapeFactory to get the circle of desired color it needs.
 * @author dengxiong90@foxmail.com
 */
public class FlyWeightPatternDemo {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	public static void main(String[] args) {
		for(int i=0; i < 20; ++i) {
			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	private static int getRandomX() {
		return (int)(Math.random()*100 );
	}
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
		
}
