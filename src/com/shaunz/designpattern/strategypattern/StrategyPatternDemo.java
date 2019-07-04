package com.shaunz.designpattern.strategypattern;

import com.shaunz.designpattern.common.util.Logger;

/**
 * Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
 * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. 
 * The strategy object changes the executing algorithm of the context object.
 * <b>Implementation</b>
 * We are going to create a Strategy interface defining an action and concrete strategy classes implementing the Strategy interface. 
 * Context is a class which uses a Strategy.
 * StrategyPatternDemo, our demo class, will use Context and strategy objects to demonstrate change in Context behaviour based on strategy it deploys or uses.
 * @author dengxiong90@foxmail.com
 *
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		Logger.log("10 + 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationSubstract());
		Logger.log("10 - 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationMultiply());
		Logger.log("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
