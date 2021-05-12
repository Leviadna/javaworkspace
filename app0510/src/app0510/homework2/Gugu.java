package app0510.homework2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gugu extends JFrame{
	JTextField t_input;
	JButton bt;
	JLabel lb;
	
	public Gugu() {
		lb = new JLabel("원하는 단 입력");
		t_input = new JTextField(15);
		bt = new JButton("실행");
		t_input.addKeyListener(new KeyControl());
		bt.addActionListener(new ActionControl());
		
		setLayout(new FlowLayout());
		
		add(lb);
		add(t_input);
		add(bt);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
	}
	public static void main(String[] args) {
		new Gugu();
	}
}
