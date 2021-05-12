package app0511.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//ChatClientA 에 대한 이벤트 처리 클래스 정의
//implements 를 선언한 순간부터 ActionEvent 를 청취할 수 있다

public class ClientAEvent implements ActionListener, KeyListener{
	private JTextField t_input; //null
	private JTextArea area;
	private JButton bt, bt_open;
	
	public void actionPerformed(ActionEvent e) {
		/*
		 * 메서드의 인수로 전달되는 e번 수에는 사용자가 일으킨 Action과 관련된 모든 정보가 들어있다
		 * ex) who?, where? when?.....
		 */
		JButton btn = (JButton)e.getSource();
		//System.out.println(btn);
		
		if(btn==bt) {
			System.out.println("전송을 원합니까?");
		}else if(btn==bt_open){
			System.out.println("오픈을 원합니까?");
		}
		
		//String msg = t_input.getText();
		//System.out.println(msg);
		showText();
	}
	
	//setter 정의
	public void setT_input(JTextField t_input) {
		this.t_input = t_input;
	}
	
	public void setArea(JTextArea area) {
		this.area = area;
	}
	
	public void setBt(JButton bt) {
		this.bt = bt;
	}
	
	public void setBt_open(JButton bt_open) {
		this.bt_open = bt_open;
	}
	
	//채팅창에 반영하기
	public void showText() {
		//(1) JTextField 값 얻기
		String msg = t_input.getText();
		//(2) JTextField 값 누적
		area.append(msg+"\n");
		//모든 입력값 초기화
		t_input.setText("");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	//
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		System.out.println(key);
		if(key==KeyEvent.VK_ENTER) { //상수를 이용하면 채팅창이 된다
			showText();
		}
	}
}







