package com.shaunz.designpattern.compositeentitypattern;

/**
 * Composite Entity pattern is used in EJB persistence mechanism. A Composite entity is an EJB entity bean which represents a graph of objects. 
 * When a composite entity is updated, internally dependent objects beans get updated automatically as being managed by EJB entity bean. 
 * Following are the participants in Composite Entity Bean.
 * Composite Entity - It is primary entity bean. It can be coarse grained or can contain a coarse grained object to be used for persistence purpose.
 * Coarse-Grained Object - This object contains dependent objects. It has its own life cycle and also manages life cycle of dependent objects.
 * Dependent Object - Dependent object is an object which depends on coarse grained object for its persistence lifecycle.
 * Strategies - Strategies represent how to implement a Composite Entity.
 * <b>Implementation</b>
 * We are going to create CompositeEntity object acting as CompositeEntity. CoarseGrainedObject will be a class which contains dependent objects. 
 * CompositeEntityPatternDemo, our demo class, will use Client class to demonstrate use of Composite Entity pattern.
 * @author dengxiong90@foxmail.com
 *
 */
public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
