package com.shaunz.designpattern.commandpattern;

import com.shaunz.designpattern.common.util.Logger;

public class Stock {
	private String name = "ABC";
	private int quantity = 10;
	
	public void buy(){
		Logger.log("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
	}
	
	public void sell(){
		Logger.log("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
	}

}
