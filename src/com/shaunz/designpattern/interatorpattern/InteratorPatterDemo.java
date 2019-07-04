package com.shaunz.designpattern.interatorpattern;

import com.shaunz.designpattern.common.util.Logger;

/**
 * Iterator pattern is a commonly used design pattern in Java and .Net programming environment. 
 * This pattern is used to get a way to access the elements of a collection object in sequential manner 
 * without any need to know its underlying representation.Iterator pattern falls under behavioral pattern category.
 * <b>Implementation</b>
 * We are going to create an Iterator interface which includes navigation method and a Container interface which returns the iterator. 
 * Concrete classes implementing the Container interface will be responsible to implement Iterator interface and use it.
 * IteratorPatternDemo, our demo class, will use NamesRepository, a concrete class implementation, to print Names stored as a collection in NamesRepository.
 * @author dengxiong90@foxmail.com
 */
public class InteratorPatterDemo {
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next();
			Logger.log("Name : " + name);
		}
	}
}
