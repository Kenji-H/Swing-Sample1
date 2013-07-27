package com.kenjih.main;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private static final long serialVersionUID = 7659185235028881266L;
	
	public static void main(String args[]) {
		new MyFrame();
	}

	public MyFrame() {
		super("Light");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 400);
		setLocationRelativeTo(null);   // スクリーン中央にフレームを表示（※setSizeの後に呼ぶこと）
		setVisible(true);
		
		Container ctn = getContentPane();
		ctn.setLayout(null);           // コンポーネントを直接座標指定
		
		for (int i = 0; i < 3; i++) {
			MyPanel panel = new MyPanel(i*300+50, 100, 200, 200);
			panel.setColor(Color.black);
		    panel.setColor(Color.WHITE);
			ctn.add(panel);

			MyButton btn = new MyButton(i*300+100, 20, 100, 50);
			btn.setAssociatedPanel(panel);
			ctn.add(btn);
		}
	}
}
