package com.shaunz.designpattern.abstractFactorypattern;

/**
 * <b>Abstract Factory Pattern</b> is one of the Creational Pattern<br/>
 * Abstract Factory patterns work around a super-factory which creates other factories. 
 * This factory is also called as factory of factories. This type of design pattern comes under creational pattern as 
 * this pattern provides one of the best ways to create an object.
 * In Abstract Factory pattern, an interface is responsible for creating a factory of related objects without 
 * explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.<br/>
 * <b>Implementation</b>
 * We are going to create a {@link Shape} and {@link Color} interfaces and concrete classes implementing these interfaces. 
 * We create an abstract factory class {@link AbstractFactory} as next step. 
 * Factory classes {@link ShapeFactory} and {@link ColorFactory} are defined where each factory extends {@link AbstractFactory}. 
 * A factory creator/generator class {@link FactoryProducer} is created. {@link AbstractFactoryPatternDemo}, our demo class, uses {@link FactoryProducer} 
 * to get an {@link AbstractFactory} object. It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to {@link AbstractFactory} 
 * to get the type of object it needs. It also passes information (RED / GREEN / BLUE for Color) to {@link AbstractFactory} to get the type of object it needs.
 * Examples in JDK: 
 * {@link javax.xml.parsers.DocumentBuilderFactory#newInstance()}
 * {@link javax.xml.transform.TransformerFactory#newInstance()}
 * {@link javax.xml.xpath.XPathFactory#newInstance()}
 * <br/>
 * @author dengxiong90@foxmail.com
 * @see javax.xml.parsers.DocumentBuilderFactory
 * @see javax.xml.transform.TransformerFactory
 * @see javax.xml.xpath.XPathFactory
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		AbstractFactory factory = FactoryProducer.getFactory("shape");
		factory.getShape("circle").draw();
		factory.getShape("square").draw();
		factory.getShape("rectangle").draw();
		factory = FactoryProducer.getFactory("color");
		factory.getColor("red").fill();
		factory.getColor("blue").fill();
		factory.getColor("green").fill();
	}
}
