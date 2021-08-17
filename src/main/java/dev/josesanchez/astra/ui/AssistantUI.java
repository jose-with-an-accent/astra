package dev.josesanchez.astra.ui;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GraphicsEnvironment;

public class AssistantUI {
	JFrame jframe = new JFrame("Astra");
	JPanel jpanel = new JPanel();
	JButton startRecordingButton = new JButton("Start Recording");

	public void drawSkeleton() {
		jframe.setUndecorated(true);
		jframe.setAlwaysOnTop(true);
		jpanel.setBackground(Color.BLUE);
		jpanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		// jframe.getContentPane().add(jpanel
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(300, 400);
		jpanel.setLayout(new java.awt.GridLayout(0, 1));

		Rectangle screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getBounds();
		jframe.setLocation((int) screen.getMaxX() - jframe.getWidth(), (int) screen.getMaxY() - jframe.getHeight());
		jpanel.add(startRecordingButton);
		jpanel.add(new VoiceDemos().show());

		jframe.add(jpanel);
		jframe.setVisible(true);

	}
}
