package com.shaunz.designpattern.adapterpattern;

import com.shaunz.designpattern.common.util.Logger;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		Logger.log("Playing mp4 file. Name: " + fileName);
	}

}
