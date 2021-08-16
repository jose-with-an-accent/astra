package dev.josesanchez.astra;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.GraphicsEnvironment;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AppUI {
	public void draw() {
		drawListenerSkeleton();
		drawIOTAdmin();
	}
	public void drawListenerSkeleton() {
		JFrame jframe = new JFrame("Astra");
		JPanel jpanel = new JPanel();

		jframe.setUndecorated(true);
		jframe.setAlwaysOnTop(true);
		jpanel.setBackground(Color.BLUE);

		jpanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		jframe.getContentPane().setBackground(Color.BLUE);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(300, 150);
		// JLabel title = new JLabel("Astra");
		// title.setForeground(Color.WHITE);

		JButton startRecordingButton = new JButton("Start Listening");
		startRecordingButton.setForeground(Color.BLUE);

		drawSuggestionsPanel();

		// jpanel.add(title);
		Rectangle screen = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getBounds();
		jframe.setLocation((int) screen.getMaxX() - jframe.getWidth(), (int) screen.getMaxY() - jframe.getHeight());
		jpanel.add(startRecordingButton);
		jframe.add(jpanel);
		jframe.setVisible(true);
	}
	public void drawIOTAdmin() {
		JFrame iotAdminPage = new JFrame("IOT Admin");
		JPanel jpanel = new JPanel();

		iotAdminPage.setSize(900, 800);
		iotAdminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jpanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		JLabel pageTitle = new JLabel("Administrate your devices.");
		// pageTitle.font

		JPanel deviceParentPanel = new JPanel();
		deviceParentPanel.setLayout(new java.awt.GridLayout(4, 4));
		deviceParentPanel.add(new JButton("Corsair Keyboard"));
		deviceParentPanel.add(new JButton("Bedroom Smart Plug"));
		deviceParentPanel.add(new JButton("Smart Lamp"));
		deviceParentPanel.add(new JButton("Thermostat"));
		deviceParentPanel.add(new JButton("Monitor Lights"));

		jpanel.add(pageTitle);
		jpanel.add(deviceParentPanel);
		iotAdminPage.add(jpanel);
		iotAdminPage.setVisible(true);
	}
	public void drawSuggestionsPanel() {
		JFrame suggestionsPanel = new JFrame();
		suggestionsPanel.setLayout(new java.awt.GridLayout(0, 1));
		// suggestionsPanel.add()

		// suggestionsPanel.add()
	}
}