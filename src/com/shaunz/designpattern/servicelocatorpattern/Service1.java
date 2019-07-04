package com.shaunz.designpattern.servicelocatorpattern;

public class Service1 implements Service{

	@Override
	public String getName() {
		return "Service1";
	}

	@Override
	public void execute() {
		System.out.println("Executing Service1");
	}
	
}
