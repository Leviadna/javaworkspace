package app0511.chat.copy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientC extends JFrame implements KeyListener{
	JTextArea area;
	JTextArea area2;
	JScrollPane scroll;
	JTextField t_input;
	ChatClientA ca;
	ChatClientB cb;
	
	//JTextArea area2;
	//JTextArea area3;
	
	public ChatClientC() {
		//this.area2=chatA.area;
		//this.area3=chatB.area;
		
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(24);
		
		setLayout(new FlowLayout());
		scroll.setPreferredSize(new Dimension(280, 280));
		area.setBackground(Color.DARK_GRAY);
		
		add(scroll);
		add(t_input);
		
		t_input.addKeyListener(this);
		
		setBounds(600, 100, 300, 400);
		setVisible(true);
	}
	
	public void setArea2(JTextArea area) {
		area2=area;
	}
	
	public void setCb(ChatClientB cb) {
		this.cb=cb;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			ShowText();
		}
	}
	
	public void ShowText() {
		String msg=t_input.getText();
		area.append(msg+"\n");
		area2.append(msg+"\n");
		cb.area.append(msg+"\n");
		t_input.setText("");
	}
}






