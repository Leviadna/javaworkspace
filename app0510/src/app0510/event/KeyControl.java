package app0510.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*JVM이 KeyEvent 객체를 생성하면 아래의 리스너에게 이벤트 객체를 전달하므로,
 * 개발자는 Keyboard와 고나련된 원하는 작업을 아래의 클래스에서 완성지으면 된다
 */

//KeyControl 클래스는 KeyListener의 자식이므로 키와 관련된 모든 이벤트를 청취 가능
public class KeyControl implements KeyListener{
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KeyTyped 호출");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KeyPressed 호출");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyReleased 호출");
	}
}
