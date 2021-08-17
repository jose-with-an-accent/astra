package dev.josesanchez.astra;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import dev.josesanchez.astra.ui.AssistantUI;
import dev.josesanchez.astra.ui.IOTDashboard;

public class AppUI {
	public void draw() {
		new AssistantUI().drawSkeleton();
		new IOTDashboard().drawUI();
	}
	public void drawListenerSkeleton() {
	}
	public void drawSuggestionsPanel() {
		JFrame suggestionsPanel = new JFrame();
		suggestionsPanel.setLayout(new java.awt.GridLayout(0, 1));
		// suggestionsPanel.add()

		// suggestionsPanel.add()
	}
}