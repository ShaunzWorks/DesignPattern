package com.shaunz.designpattern.chainpattern;

import com.shaunz.designpattern.common.util.Logger;

public class ErrorLogger extends AbstractLogger{
	
	public ErrorLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.log("Error Console::Logger: " + message);
	}

}
