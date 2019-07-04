package com.shaunz.designpattern.observerpattern;

import com.shaunz.designpattern.common.util.Logger;

public class OctalObserver extends Observer{
	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		Logger.log( "Octal String: "+ Integer.toOctalString( subject.getState() ) );
	}
}
