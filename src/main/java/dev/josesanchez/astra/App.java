package dev.josesanchez.astra;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Trying to start the voice assistant app thing");
		SpeechRecognizer speechRecognizer = new SpeechRecognizer();
		AppUI appUI = new AppUI();
		Console console = System.console();
		// NLPService nlpService = new NLPService();
		appUI.draw();
		// nlpService.doYourThing(console.readLine());
	}
}
