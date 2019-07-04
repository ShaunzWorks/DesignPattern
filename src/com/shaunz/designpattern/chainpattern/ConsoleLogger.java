package com.shaunz.designpattern.chainpattern;

import com.shaunz.designpattern.common.util.Logger;

public class ConsoleLogger extends AbstractLogger{
	
	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.log("Standard Console::Logger: " + message);
	}

}
