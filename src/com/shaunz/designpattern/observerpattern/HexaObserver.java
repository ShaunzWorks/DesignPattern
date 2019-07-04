package com.shaunz.designpattern.observerpattern;

import com.shaunz.designpattern.common.util.Logger;

public class HexaObserver extends Observer{
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		Logger.log( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
	}
}
