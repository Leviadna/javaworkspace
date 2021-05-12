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

public class ChatClientB extends JFrame implements KeyListener{
	JTextArea area;
	JTextArea area2;
	JScrollPane scroll;
	JTextField t_input;
	ChatClientA ca;
	ChatClientC cc;
	
	//JTextArea area2; //ChatClientA가 보유한 JTextArea의 주소값
	//JTextArea area3;
	
//	public ChatClientB(JTextArea area2) {
//		this.area2=area2;
//	}
	
	public ChatClientB() {
		//this.area2=chatA.area;
		//this.area3=chatC.area;
		//생성
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(24);
		
		//스타일
		setLayout(new FlowLayout());
		scroll.setPreferredSize(new Dimension(280, 280));
		area.setBackground(Color.CYAN);
		
		//조립
		add(scroll);
		add(t_input);
		
		//이벤트연결
		t_input.addKeyListener(this);
		
		//보여주기
		setBounds(600, 100, 300, 400);
		setVisible(true);
	}
	
	//setter
	
	public void setArea2(JTextArea area) {
		area2=area;
	}
	
	public void setCc(ChatClientC cc) {
		this.cc=cc;
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
			showText();
		}
	}
	
	public void showText() {
		String msg=t_input.getText(); //(1)나의 텍스트 필드값 구하기
		area.append(msg+"\n"); //(2)나의 TextArea에 누적
		area2.append(msg+"\n"); //(3)ChatA의 TextArea에 누적
		cc.area.append(msg+"\n");
		t_input.setText("");//(4)입력값 다시 초기화
	}
}








