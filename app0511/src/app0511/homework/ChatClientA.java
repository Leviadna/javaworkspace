package app0511.homework;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientA extends JFrame implements ActionListener, KeyListener{
	JButton bt_open; //대화 상대방과 싸우기 위한 버튼
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	JButton bt;
	ChatClientB chatClientB;
	ChatClientC chatClientC;
	
	public ChatClientA() {
		//생성
		bt_open = new JButton("열기");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(20);
		bt = new JButton("전송");
		//스타일
		this.setLayout(new FlowLayout());
		scroll.setPreferredSize(new Dimension(280, 300));
		area.setBackground(new Color(250,255,0));
		//조립
		add(bt_open);
		add(scroll);
		add(t_input);
		add(bt);
		
		//이벤트 리스너와의 연결
		bt.addActionListener(this); //전송버튼과 리스너 연결
		bt_open.addActionListener(this); //오픈버튼과 리스너 연결
		t_input.addKeyListener(this); //텍스트필드와 리스너 연결
	
		//보여주기
		setBounds(300, 100, 300, 400); //x, y, width, height
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_ENTER) {
			showText();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//열기 버튼 누르면
		if(e.getSource()==bt_open) {
			//System.out.println("눌렀니?");
			chatClientB = new ChatClientB();
			chatClientC = new ChatClientC();
			
			//clientB를 위한 설정 (A, C 정보를 넘겨야 한다)
			chatClientB.setChatClientA(this);
			chatClientB.setChatClientC(chatClientC);
			//clientC를 위한 설정 (A, B 정보를 넘겨야 한다)
			chatClientC.setChatClientA(this);
			chatClientC.setChatClientB(chatClientB);
		}else if(e.getSource()==bt) { //전송 버튼 누르면
			//System.out.println("눌렀구나?");
			showText();
		}
	}
	
	//전송처리
	public void showText() {
		String msg = t_input.getText(); //(1) TextField 값 가져오기
		area.append(msg+"\n"); //(2) TextArea에 누적
		t_input.setText(""); //(3) 입력값 초기화
		
		//친구인 상대방 채팅창의 area.append(msg+"\n");
		chatClientB.area.append(msg+"\n");
		chatClientC.area.append(msg+"\n");
	}
	
	public static void main(String[] args) {
		new ChatClientA();
	}
}





