package com.kenjih.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.Timer;

public class MyButton extends JButton {
	private static final long serialVersionUID = 894329665676526580L;
	private MyPanel panel;
	private Timer timer;
	
	public MyButton(int x, int y, int width, int height) {
		super("GO!");
		setBounds(x, y, width, height);
		timer = new Timer(100, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {	
				panel.setColor(new Color(new Random().nextInt()));
			}
		});
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if ("GO!".equals(getText())) {
					timer.start();
					setText("STOP!");
				} else {
					timer.stop();
					setText("GO!");
				}
				
			}
		});
	}
	
	public void setAssociatedPanel(MyPanel panel) {
		this.panel = panel;
	}
}

