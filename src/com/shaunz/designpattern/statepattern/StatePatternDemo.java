package com.shaunz.designpattern.statepattern;

import com.shaunz.designpattern.common.util.Logger;

/**
 * In State pattern, a class behavior changes based on its state. This type of design pattern comes under behavior pattern.
 * In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
 * <b>Implementation</b>
 * We are going to create a State interface defining an action and concrete state classes implementing the State interface. 
 * Context is a class which carries a State.
 * StatePatternDemo, our demo class, will use Context and state objects to demonstrate change in Context behavior based on type of state it is in.
 * @author dengxiong90@foxmail.com
 */
public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		Logger.log(context.getState().toString());
		StopState stopState = new StopState();
		stopState.doAction(context);
		Logger.log(context.getState().toString());
	}
}
