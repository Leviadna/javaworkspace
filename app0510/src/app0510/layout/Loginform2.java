/*

package app0510.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

//Loginform 예제에서는 메인 메서드 안에 변수를 넣는다 (지역변수로 개체를 처리하고)
//oop 언어의 is a, has a
public class Loginform2 extends Frame{
	
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	
	Panel p_center;
	Panel p_south;
	
	//이 로그인폼이 메모리에 생성될 때 해당 부품을 생성하려면 생성자 메서드를 활용해야 한다
	public Loginform2() {
		
		super("Loginform 2")
		//부품 생성
		la_id=new Label("ID");
		t_id=new TextField(20);
		la_pass=new Label("Pass");
		t_pass=new TextField(20);
		bt_login=new Button("Login");
		bt_join=new Button("Join");
		p_center=new Panel();
		p_south=new Panel();
		
		la_id.setPreferredSize(getPreferredSize());
		//스타일 설정
		//la_id.setPreferredSize(new Dimension(110, 35));
		//t_id.setPreferredSize(new Dimension(110, 35));
		//la_pass.setPreferredSize(new Dimension(110, 35));
		//t_pass.setPreferredSize(new Dimension(110, 35));
		
		//조립
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		//패널을 윈도우 센터에 부착
		this.add(p_center);
		this.add(p_south, BorderLayout.SOUTH);
		
		//윈도우의 크기 설정
		this.setSize(330, 125);
		//윈도우 보이게
		this.setVisible(true);
		
		//윈도우에 제목달기 - 방법1: 부모의 일반메서드 이용
		//this.setTitle("LoginFrom style 2");
		
		//부모의 생성자 이용하는 방법
		
	}
}

*/



