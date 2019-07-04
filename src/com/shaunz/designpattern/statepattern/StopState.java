package com.shaunz.designpattern.statepattern;

import com.shaunz.designpattern.common.util.Logger;

public class StopState implements State{
	public void doAction(Context context) {
		Logger.log("Player is in stop state");
		context.setState(this);
	}
	public String toString(){
		return "Stop State";
	}
}
