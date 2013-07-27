package com.kenjih.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = -8136939074423275504L;
	
	private Color color;
	
	public MyPanel(int x, int y, int width, int height) {
		setBounds(x, y, width, height);

		Timer timer = new Timer(100, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});

		timer.start();
	}
		
	public void setColor(Color color) {
		this.color = color;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillOval(0, 0, 200, 200);
	}
}
