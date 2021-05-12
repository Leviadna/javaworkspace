package app0510.homework;

import java.awt.FlowLayout;

import javax.swing.*;

public class Gugudan extends JFrame{
	JTextField t_input;
	JButton bt;
	JLabel lb;
	
	public Gugudan() {
		
		//생성
		lb = new JLabel("원하는 단 입력");
		t_input = new JTextField(15);
		bt = new JButton("등록");
		bt.addActionListener(new ActionControl(t_input));
		//스타일
		setLayout(new FlowLayout());
		//조인
		add(lb);
		add(t_input);
		add(bt);
		//보여주기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(150, 200);
		
	}
	public static void main(String[] args) {
		new Gugudan();
	}
}
