package dev.josesanchez.astra;

import java.io.ByteArrayOutputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.TargetDataLine;

public class SpeechRecognizer {
	public void recognize() {
		// LibVosk.setLogLevel(LogLevel.DEBUG);
		// AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 600000, 16, 2, 4, 44100, false));
		// DataLine.Info info = new DataLine.Info(TargetDataLine.class, format));

		// TargetDataLine microphone;
		// SourceDataLine speakers;

		// try (Model model = new Model("");
		// Recognizer recog
		nizer = new Recognizer(model, 120000)) {
		// 	try {
		// 		microphone = (TargetDataLine) AudioSystem.getLine(info);
		// 		microphone.open(format);
		// 		microphone.start();

		// 		ByteArrayOutputStream out = new ByteArrayOutputStream();
		// 		int num
		// 	}
		// }


	}
}