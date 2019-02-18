package ru.javaops.android.tamagotchi;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

public class SoundPlayer {
    private SoundPool soundPool;

    public SoundPlayer() {
        int SOUND_POLL_MAX = 3;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(audioAttributes)
                    .setMaxStreams(SOUND_POLL_MAX)
                    .build();
        } else {
            soundPool = new SoundPool(SOUND_POLL_MAX, AudioManager.STREAM_MUSIC, 0);
        }

    }

    public SoundPool getSoundPool() {
        return soundPool;
    }

    public void playSound(int petSound) {
        soundPool.play(petSound, 1.0f, 1.0f, 1, 0, 1.0f);
    }

}
