/*
 * AWT 자바의 GUI API를 대부분 지원하지만 플랫폼(OS)마다 디자인이 일관적이지
 * 않은 문제점이 있고, 이를 위해 
 */


package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame{
	JButton bt;
	//has a 관계 객체
	//has a 관계로 다른 객체를 보유할 경우 개발자는 생성자를 적극 활욯하면 좋다
	
	public SwingTest() {
		
		//생성
		bt = new JButton("내가 버튼");
		
		//스타일
		this.setSize(new Dimension(300, 400));
		
		//조립
		this.setLayout(new FlowLayout());
		this.add(bt);
		
		//보여주기
		this.setVisible(true);
		
		//스윙에서 윈도우 창 닫기 버튼은 그냥 setVisible을 false로 두는 것 뿐이다
		//즉, 아직 프로세스는 살아있다
		//해결책 --> 1) 이벤트 구현  2) 알맞는 메서드 호출
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}
}



