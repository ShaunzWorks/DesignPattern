package com.shaunz.designpattern.nullobjectpattern;

import com.shaunz.designpattern.common.util.Logger;

/**
 * In Null Object pattern, a null object replaces check of NULL object instance. 
 * Instead of putting if check for a null value, Null Object reflects a do nothing relationship. 
 * Such Null object can also be used to provide default behaviour in case data is not available.
 * In Null Object pattern, we create an abstract class specifying various operations to be done, 
 * concrete classes extending this class and a null object class providing do nothing implementation of this class and will be used to check null value.
 * <b>Implementation</b>
 * We are going to create an AbstractCustomer abstract class defining operations. 
 * Here concrete classes will extend the AbstractCustomer class. 
 * A factory class CustomerFactory is created to return either RealCustomer or NullCustomer objects based on the name of customer passed to it.
 * NullPatternDemo, our demo class, will use CustomerFactory to demonstrate the use of Null Object pattern.
 * @author dengxiong90@foxmail.com
 */
public class NullObjectPatternDemo {
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
		Logger.log("Customers");
		Logger.log(customer1.getName());
		Logger.log(customer2.getName());
		Logger.log(customer3.getName());
		Logger.log(customer4.getName());
	}
}
