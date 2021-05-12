/*
GUI 프로그래밍은 무조건 윈도우가 있어야 한다
따라서 자바 언어에서 GUI와 관련된 패키지는 awt/swing에서 지원한다
javaFX (안드로이드와 많이 유사)
*/

package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Choice;

public class MyWin{
	//자바에서 윈도우는 Frame이라는 클래스가 실질적으로 담당
	public static void main(String[] args){
		Frame frame; //객체의 인스턴스가 없다. 따라서 frame은 초기화되어 있지 않다

		/*Frame이라는 클래스는 사용하라고 제공해줬는데 어떻게 사용할지가 난감하다
		우리가 정의한 것이 아니라 남이 제공해준 것이므로
		[남에게서 제공받은 객체를 사용하는 Tip]
			1) 해당 클래스의 속성, 용도가 무엇인지
			2) 사용을 위해서는 메모리에 올려야 한다
				메모리에 올리려면 해당 객체가 일반인지, 추상인지, 인터페이스인지 조사해야 한다
				- 일반클래스의 경우: new를 사용
				- 추상클래스의 경우: 자식을 만든 후 자식을 new 처리하면 된다
				- 인터페이스의 경우: 자식을 만든 후 자식을 new 처리하면 된다
			3) 메모리에 어떤 방식으로 올릴지 결정되었다면...
				- 일반클래스의 경우 new 다음에 오는 생성자를 조사
		*/
		frame = new Frame(); //프레임은 기본적으로 눈에 보이지 않도록 속성이 지정되어 있다
		
		//윈도우 안에 부착할 버튼 생성
		Button bt=new Button("내가 바로 버튼 !"); //Button is a Component!!!!
		
		/*
		버튼 부착 후 버튼이 대왕크기로 나오는 이유?
		모든 GUI 프로그래밍은 화면의 배치 방법을 개발자가 결정해야 한다
		html에서 absolute, relative가 있듯이 GUI 역시 더욱 이러한 면에서 더욱 까다롭고 엄격하다
		현재 우리는 아무런 배치(Layout)를 결정하지 않았기 때문에 시스템이 제공하는
		디폴트 배치가 적용되어 원하는 효과가 나오지 않은 것이다
		*/

		FlowLayout flow = new FlowLayout();
		//컴포넌트를 선형으로 배치하는 레이아웃 객체
		//수평 혹은 수직으로 부착할지 정해야 한다

		frame.setLayout(flow); //프레임에 배치관리자 지정
		
		//입력텍스트 박스를 생성하여 붙여보자
		TextField t = new TextField(20); //20자 크기의 너비가 확보됨

		//체크박스 생성
		Checkbox ch1 = new Checkbox("영화");
		Checkbox ch2 = new Checkbox("프로그래밍");
		Checkbox ch3 = new Checkbox("수영");
		Checkbox ch4 = new Checkbox("여행");
		
		//TextArea 생성
		TextArea area = new TextArea(5, 15); //5줄

		//html의 select박스는 java에서는 Choice라고 한다
		Choice choice = new Choice(); //naver, google. daum
		choice.add("Choose Your E-mail");
		choice.add("naver.com");
		choice.add("google.com");
		choice.add("daum.net");

		//password
		PasswordField

		frame.add(bt); //프레임에 버튼 부착
		frame.add(t); //프레임에 텍스트필드 부착
		frame.add(ch1); //프레임에 체크박스 부착
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		frame.add(area);
		frame.add(choice);

		//따라서 개발자가 원하는 타이밍에 눈에 보일 수 있도록 속성을 변경하는 메서드를 호출하자
		//api document를 이용해 찾기
		frame.setVisible(true); //아버지인 Window 클래스에서 물려받은 메서드

		//크기 역시 명시하지 않으면 원하는 크기로 윈도우가 보이지 않는다
		frame.setSize(300, 400); //아버지인 Window 클래스에서 물려받은 메서드
	}
}