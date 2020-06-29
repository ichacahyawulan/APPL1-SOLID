package com.appl.solid.Main;

import com.appl.solid.Models.*;

public class Main {

	public static void main(String[] args) {
		File file = new File("I'm a file", 12, 24);
		Music music = new Music("Your Name", "Cool", 15, 3630);
		
		StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);

        System.out.println(streamFileInfo.calculateCurrentPercent());
        System.out.println(streamMusicInfo.calculateCurrentPercent());
	}

}
