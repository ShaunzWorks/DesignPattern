package com.shaunz.designpattern.mementopattern;

import com.shaunz.designpattern.common.util.Logger;

/**
 * Memento pattern is used to restore state of an object to a previous state. 
 * Memento pattern falls under behavioral pattern category.
 * <b>Implementation</b>
 * Memento pattern uses three actor classes. Memento contains state of an object to be restored. Originator creates and stores states in 
 * Memento objects and Caretaker object is responsible to restore object state from Memento. We have to create Memento, Originator, and CareTaker classes.
 * MementoPatternDemo, our demo class, will use CareTaker and Originator objects to show restoration of object states.
 * @author dengxiong90@foxmail.com
 */
public class MementoPatternDemo {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #3");
		careTaker.add(originator.saveStateToMemento());
		originator.setState("State #4");
		Logger.log("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		Logger.log("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		Logger.log("Second saved State: " + originator.getState());
	}
}
