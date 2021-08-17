package dev.josesanchez.astra.ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
public class VoiceDemos {
	JPanel demosPanel = new JPanel();
	public VoiceDemos() {

		demosPanel.setLayout(new java.awt.GridLayout(0, 1));

		JPanel demoCommandFrame1 = new JPanel();
		demoCommandFrame1.setBackground(Color.BLUE);
		demoCommandFrame1.setLayout(new java.awt.GridLayout(0, 1));

		demoCommandFrame1.add(new JLabel("Search The Internet"));
		demoCommandFrame1.add(new JLabel("Hey Astra, open Reddit"));

		JPanel demoCommandFrame2 = new JPanel();
		demoCommandFrame2.setBackground(Color.BLUE);
		demoCommandFrame2.setLayout(new java.awt.GridLayout(0, 1));

		demoCommandFrame2.add(new JLabel("Control devices"));
		demoCommandFrame2.add(new JLabel("Hey Astra, turn my keyboard's lights on"));

		JPanel demoCommandFrame3 = new JPanel();
		demoCommandFrame3.setBackground(Color.BLUE);
		demoCommandFrame3.setLayout(new java.awt.GridLayout(0, 1));
		demoCommandFrame3.add(new JLabel("Get Directions"));
		demoCommandFrame3.add(new JLabel("Hey Astra, where is Vail Systems?"));

		demosPanel.add(demoCommandFrame1);
		demosPanel.add(demoCommandFrame2);
		demosPanel.add(demoCommandFrame3);
	}
	public JPanel show() {
		return demosPanel;
	}
}
