package com.shaunz.designpattern.bridgepattern;

import com.shaunz.designpattern.common.util.Logger;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		Logger.log("Drawing Circle[ color: green, radius:" + radius + ", x: " + x +", " + y + "]");
	}

}
