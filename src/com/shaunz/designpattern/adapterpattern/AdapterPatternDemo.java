package com.shaunz.designpattern.adapterpattern;

/**
 * <b>Adapter Pattern</b> one of the Structural Pattern<br/>
 * Adapter pattern works as a bridge between two incompatible interfaces. 
 * This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
 * This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. 
 * A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
 * You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
 * We are demonstrating use of Adapter pattern via following example in which an audio player device can play mp3 files only and wants 
 * to use an advanced audio player capable of playing vlc and mp4 files.
 * <b>Implementation</b>
 * We have a {@link MediaPlayer} interface and a concrete class {@link AudioPlayer} implementing the {@link MediaPlayer} interface. 
 * {@link AudioPlayer} can play mp3 format audio files by default.
 * We are having another interface {@link AdvancedMediaPlayer} and concrete classes implementing the {@link AdvancedMediaPlayer} interface. 
 * These classes can play vlc and mp4 format files.
 * We want to make {@link AudioPlayer} to play other formats as well. 
 * To attain this, we have created an adapter class {@link MediaAdapter} which implements the {@link MediaPlayer} interface and uses {@link AdvancedMediaPlayer} 
 * objects to play the required format.
 * {@link AudioPlayer} uses the adapter class {@link MediaAdapter} passing it the desired audio type without knowing the actual class 
 * which can play the desired format. {@link AdapterPatternDemo}, our demo class, will use {@link AudioPlayer} class to play various formats.
 * Examples in JDK:
 * {@link java.util.Arrays#asList(Object...)}
 * {@link java.util.Collections#list(java.util.Enumeration)}
 * {@link java.util.Collections#enumeration(java.util.Collection)}
 * {@link java.io.InputStreamReader}
 * {@link java.io.OutputStreamWriter}
 * {@link javax.xml.bind.annotation.adapters.XmlAdapter#marshal(Object)} and {@link javax.xml.bind.annotation.adapters.XmlAdapter#unmarshal(Object)}
 * @author dengxiong90@foxmail.com
 * @see java.util.Arrays
 * @see java.util.Collections
 * @see java.io.InputStreamReader
 * @see java.io.OutputStreamWriter
 * @see javax.xml.bind.annotation.adapters.XmlAdapter
 *
 */
public class AdapterPatternDemo {
	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
