package com.shaunz.designpattern.singletonpattern;

import com.shaunz.designpattern.common.util.Logger;

public class SingletonObject {
	//private static SingletonObject instance = null;
	private static SingletonObject instance = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance(){
		if(instance == null){
			instance = new SingletonObject();
		}
		return instance;
	}
	public void showMessage(){
		Logger.log("Hello World!");
	}
}
