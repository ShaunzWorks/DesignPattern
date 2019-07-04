package com.shaunz.designpattern.singletonpattern;

/**
 * 
 * @author dengxiong90@foxmail.com
 * Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational 
 * pattern as this pattern provides one of the best ways to create an object.This pattern involves a 
 * single class which is responsible to create an object while making sure that only single object gets created. 
 * This class provides a way to access its only object which can be accessed directly without instantiating the object of the class.
 * 
 * <b>Implementation</b>
 * We are going to create a SingleObject class which has its constructor as private and a static instance of itself.
 * SingleObject class provides a static method to get its static instance to outside world. SingletonPatternDemo, 
 * our demo class, will use SingleObject class to get a SingleObject object.
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingletonObject.getInstance().showMessage();
	}
}
