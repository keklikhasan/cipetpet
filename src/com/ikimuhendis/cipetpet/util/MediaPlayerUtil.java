package com.ikimuhendis.cipetpet.util;

import android.app.Activity;
import android.media.MediaPlayer;

public class MediaPlayerUtil {
	private static MediaPlayer mp = null;

	public static void playAudioFromList(Activity activty, int resourceId) {
		if (resourceId > -1) {
			if (mp != null) {
				if (mp.isPlaying()) {
					mp.stop();
				}
			} else {
				mp = new MediaPlayer();
			}
			try {
				mp = MediaPlayer.create(activty, resourceId);
				mp.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
