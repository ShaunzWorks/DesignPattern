package com.shaunz.designpattern.factorypattern;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>Creational Pattern</b>
 * @author dengxiong90@foxmail.com
 * Factory pattern is one of most used design patterns in Java. This type of design pattern comes under creational 
 * pattern as this pattern provides one of the best ways to create an object.
 * In Factory pattern, we create objects without exposing the creation logic to the client and refer to newly created object using a common interface.
 * 
 * <b>Implementation</b>
 * We are going to create a Shape interface and concrete classes implementing the Shape interface. 
 * A factory class ShapeFactory is defined as a next step.FactoryPatternDemo, our demo class, will use ShapeFactory to get a Shape object. 
 * It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.
 */
public class FactoryPatternDemo {
	public final static String FILE_SEPARATOR = File.separator;
	
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		List<String> shapeClassesNm = getShapeClasses();
		for (String shapeClassNm : shapeClassesNm) {
			shapes.add(shapeFactory.getShape(shapeClassNm));
		}
		
		for (Shape shape : shapes) {
			shape.draw();
		}
	
	}

	public static List<String> getShapeClasses() {
		List<String> shapeClasses = new ArrayList<String>();
		try {
			String rootPath = FactoryPatternDemo.class.getProtectionDomain().getCodeSource().getLocation().getPath().substring(1);
			Package factoryPatternPackage = FactoryPatternDemo.class.getPackage();
			String packagePath = factoryPatternPackage.getName();
			String absolutePath = rootPath.replace("/", FILE_SEPARATOR)+packagePath.replace(".", FILE_SEPARATOR)+FILE_SEPARATOR;
			File FactoryPatternFolder = new File(absolutePath);
			File[] listOfFiles = FactoryPatternFolder.listFiles();
			for (File file : listOfFiles) {
				String classNm = file.getName().substring(0, file.getName().indexOf("."));
				if(!"Shape".equals(classNm) && !"ShapeFactory".equals(classNm) && Class.forName(packagePath+"."+classNm).newInstance() instanceof Shape){
					shapeClasses.add(classNm);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shapeClasses;
        
    }
}
