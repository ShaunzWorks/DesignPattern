package com.shaunz.designpattern.proxypattern;

import com.shaunz.designpattern.common.util.Logger;

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	@Override
	public void display() {
		Logger.log("Displaying " + fileName);
	}
	private void loadFromDisk(String fileName){
		Logger.log("Loading " + fileName);
	}
}
