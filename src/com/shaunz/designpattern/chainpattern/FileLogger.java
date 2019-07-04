package com.shaunz.designpattern.chainpattern;

import com.shaunz.designpattern.common.util.Logger;

public class FileLogger extends AbstractLogger{
	
	public FileLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		Logger.log("File::Logger: " + message);
		
	}

}
