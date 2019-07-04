package com.shaunz.designpattern.observerpattern;

import com.shaunz.designpattern.common.util.Logger;

public class BinaryObserver extends Observer{
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		Logger.log( "Binary String: "+ Integer.toBinaryString( subject.getState() ) );
	}
}
