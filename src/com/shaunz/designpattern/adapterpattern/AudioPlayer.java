package com.shaunz.designpattern.adapterpattern;

import com.shaunz.designpattern.common.util.Logger;

public class AudioPlayer implements MediaPlayer{
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if("mp3".equalsIgnoreCase(audioType)){
			Logger.log("Playing mp3 file. Name: " + fileName);
		} else if("mp4".equalsIgnoreCase(audioType) ||
				"vlc".equalsIgnoreCase(audioType)){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			Logger.log("Invalid media. " + audioType + " format not supported");
		}
	}

}
