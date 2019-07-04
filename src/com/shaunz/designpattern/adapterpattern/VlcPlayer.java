package com.shaunz.designpattern.adapterpattern;

import com.shaunz.designpattern.common.util.Logger;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		Logger.log("Playing vlc file. Name: " + fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
	}

}
