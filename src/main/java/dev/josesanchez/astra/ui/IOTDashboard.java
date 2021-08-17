package dev.josesanchez.astra.ui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IOTDashboard {
	JFrame iotAdminPage = new JFrame("IOT Admin");
	JPanel jpanel = new JPanel();
	Font defaultFont = new Font("Red Hat Text", Font.PLAIN, 13);

	public void drawUI() {

		iotAdminPage.setSize(480, 270);
		iotAdminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iotAdminPage.setLayout(new java.awt.GridLayout(0, 1));

		jpanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		JLabel pageTitle = new JLabel("Administrate your devices.");
		pageTitle.setFont(defaultFont.deriveFont(32));
		// pageTitle.font

		JPanel deviceParentPanel = new JPanel();
		deviceParentPanel.setLayout(new java.awt.GridLayout(4, 4));

		for (int i = 0; i < 6; i++) {
			JPanel statusPanel = new JPanel();
			statusPanel.setLayout(new java.awt.GridLayout(0, 1));
			statusPanel.add(new JLabel("Corsair Keyboard"));
			statusPanel.add(new JButton("Settings"));
			statusPanel.add(new JLabel("Status: "));
			statusPanel.add(new JLabel("OK"));
			
			deviceParentPanel.add(statusPanel);
		}

		jpanel.add(pageTitle);
		jpanel.add(deviceParentPanel);
		iotAdminPage.add(jpanel);
		iotAdminPage.setVisible(true);
	}
}
