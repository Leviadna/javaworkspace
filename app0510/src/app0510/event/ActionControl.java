package app0510.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* JVM이 OS로부터 이벤트 정보를 넘겨받아
 * 해당 이벤트에 알맞는 객체의 인스턴스를 생성하면
 * EX) 사용자 click --> OS --> JVM에게 정보전달 -->
 * JVM이 해당 이벤트 정보에 알맞는 객체의 인스턴스를 올린다
 * 이 클래스에서는 ActionEvent의 인스턴스를 올린다
 * 따라서 JVM이 넘겨준 이벤트 정보를 수신하여 원하는 이벤트 처리를 시도해보자
 * */
public class ActionControl implements ActionListener{
										/*  is   a  */
	/*개발자가 구현해야 할 추상메서드
	 * 이 메서드의 매개변수로 JVM이 생성한 이벤트 객체가 전달됨
	 * 따라서 이벤트를 객체를 이용하여 각종 정보를 추출한 뒤
	 * 원하는 작업을 수행할 수 있다
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}
}
