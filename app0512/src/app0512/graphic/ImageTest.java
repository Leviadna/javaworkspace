package app0512.graphic;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageTest extends JFrame{
	
	Image img=null;
	//이미지는 불완전하므로(추상클래스) 개발자가 직접 new 처리 할 수 없다
	//일반적으로 추상클래스는 개발자가 상속받아 완성한 후 자식 객체를 생성할 때
	//사용할 수 있지만 언제나 그런것은 아니며 sun에서 추상 클래스 객체의
	//인스턴스를 얻는 또 다른 방법을 제공해주는 경우도 많다 (즉 메서드 호출에 의해 인스턴스를 얻는다)
	
	Toolkit kit; //툴킷을 이용하면 os경로로 접근한 이미지의 인스턴스를 얻을 수 있다

	public ImageTest() {
		//이미지를 얻기 위한 툴킷 객체의 인스턴스를 먼저 얻어와야한다
		kit = Toolkit.getDefaultToolkit(); //인스턴스를 얻는 메서드 사용
		
		img=kit.getImage("C:\\korea202102_javaworkspace\\app0512\\rec\\image\\min.JPG");
		
		setBounds(600, 100, 700, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//paint 메서드 재정의
	@Override
	public void paint(Graphics g) {
		//이미지객체, x, y, 옵저버(null)
		g.drawImage(img, 0, 0, null);
	}
	
	public static void main(String[] args) {
		new ImageTest();
	}
}
