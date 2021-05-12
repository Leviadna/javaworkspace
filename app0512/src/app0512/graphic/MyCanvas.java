package app0512.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas{
	
	ImageMove moveTest; //null
	
	//이 생성자를 호출하는 자는 MoveTest의 주소값을 인수로 넘겨야 한다
	//이렇게 하면 MyCanvas는 태어날 때부터 MoveTest의 주소값을 보유하게 된다
	public MyCanvas(ImageMove moveTest) {
		this.moveTest=moveTest;
	}
	/*캔버스가 그려진 그림을 개발자가 주도하여 원하는 그림을 그려보자
	 * paint 메서드에 대하여
	 * 특징: 개발자가 paint메서드를 호출해서는 안된다
	 * paint 메서드는 시스템이 그래픽의 렌더링시 필요에 의해 호출된다
	 * 처음의 그림과 비교해 다른 부분이 있으면 시스쳄이 알아서 다시 호출한다
	 * 동작원리: 1. 기존의 그림을 지운다 (update메서드)
	 * 				2. 그림을 그린다 (Paint메서드)
	 * 문제점? 사용자가 윈도우창의 크기를 변화시키거나 그래픽 상의 변화를 통해 paint() aptjemfmf
	 * 호출하는 게 아니고 개발자가 원하는 시점에 프로그래밍적으로 paint()를 호출하는 방법
	 * sun에서는 그래픽이 화면에 반영되는 처리를 시스템이 하기 때문에
	 * paint()메서드 호출을 원칙적으로 막아놓았다.
	 * 따라서 개발자는 시스템에게 paint()가 호출될 수 있도록 간접적으로 요청을 하는 방식으로
	 * 그래픽 처리를 할 수 있다. 이때 호출해야 할 메서드가 바로 repaint();
	 * 	repaint() 그래픽의 갱신을 요청하게 되고, 이때 이 요청이 들어오면 update() 가 호출되어
	 * 	화면을 지우며, 화면을 지우고나서 깨끗해지면 paint() 
	 * 	repaint() --> update()  --> paint()
	 */
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.yellow); //이 시점부터 노란색으로 그려진다
		g.fillOval(moveTest.x, 100, 100, 100);
	}
}
