package com.shaunz.designpattern.interceptngfilterpattern;

public class DebugFilter implements Filter{

	@Override
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
	
}
