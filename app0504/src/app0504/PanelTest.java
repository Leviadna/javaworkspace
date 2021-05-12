package app0504;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {
	public static void main(String[] args) {
		//그래픽 api중 Panel을 학습
		Frame frame=new Frame("Panel Test");
		//아래처럼 인스턴스 자체를 넣는 경우는 BorderLayout 객체의 레퍼런스를
		//굳이 사용할 필요가 없는 경우 즉, 1회성일 때 변수는 필요가 없을 수도 있다
		//BorderLayout layout=new BorderLayout();
		frame.setLayout(new BorderLayout());
		Button bt = new Button("I'm Button");
		frame.add(bt); //개발자가 Border의 5가지 방향을 정하지 않는 경우 center가 디폴트가 된다
		//결론: 버튼이 혼자 존재하기 때문에 동서남북 모든 방위를 독차지함
		
		Panel p = new Panel(); //컴포넌트 중 말 그대로 무언가를 올려놓을 수 있는 패널을 의미
		//패널은 Container의 자식으로, 다른 컴포넌트를 포함할 수 있는 능력이 있다
		//또한 Container이기에 배치관리자 역시 사용 가능하다
		//왕버튼에 대한 해결책 !? -> Frame에 Panel을 부착하고 이 Panel에 FlowLayout을 적용한 후
		//최종적으로 Button을 Panel에 부착하면 된다
		p.setBackground(Color.RED); //패널에 빨간 배경 적용
		frame.add(p); //윈도우에 판자 붙이기
		
		//버튼을 패널에 부착하자
		//개발자가 Panel의 배치관리자를 지정하지 않으면 Default는
		//FlowLayout: 플로우는 컴포넌트 본연의 크기가 유지된다
		p.add(bt); //패널에 버튼 부착
		
		frame.setSize(300, 250);
		frame.setVisible(true);
	}
}
