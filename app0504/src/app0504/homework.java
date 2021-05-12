package app0504;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class homework {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		frame.setLayout(new BorderLayout());
		
		TextField t1 = new TextField(20);
		TextField t2 = new TextField(20);
		
		Panel p = new Panel();
		p.setBackground(Color.YELLOW);
		
		Panel p2 = new Panel();
		p2.setBackground(Color.WHITE);
		
		p.setSize(300, 100);
		p2.setSize(300, 50);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(p);
		frame.add(p2);
		
		frame.setVisible(true);
		
		frame.setSize(300, 150);
	}
}
