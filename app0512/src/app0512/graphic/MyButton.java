package app0512.graphic;

import java.awt.Graphics;

import javax.swing.JButton;

public class MyButton extends JButton{
	public MyButton(String label) {
		super(label);
	}
	//개발자가 직접 그림을 뺏어서 그려보자
	/*
	public void paint(Graphics g) {
		System.out.println("나 버튼");
	}
	*/
}
