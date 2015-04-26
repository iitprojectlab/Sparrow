package our;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SoundCreate {
	private static int duration=10;
	private static int rate=100;
	private static int volume=50;
	
public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
public SoundCreate() {
	// TODO Auto-generated constructor stub
}

public SoundCreate(String str) {
	// TODO Auto-generated constructor stub

        String voiceName = "mbrola_us1"; // the only usable general purpose voice

        VoiceManager voiceManager = VoiceManager.getInstance();
        
        Voice voice = voiceManager.getVoice(voiceName);

        // some effects:
        // helloVoice.setPitch(20.0f);
        voice.setDurationStretch(getDuration());
        voice.setRate(getRate());
        voice.setVolume(getVolume());
        
        voice.allocate();        
        voice.getGender();
        voice.speak(str);
        
        voice.deallocate();
	}
}