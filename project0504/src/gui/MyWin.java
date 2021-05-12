/*
GUI ���α׷����� ������ �����찡 �־�� �Ѵ�
���� �ڹ� ���� GUI�� ���õ� ��Ű���� awt/swing���� �����Ѵ�
javaFX (�ȵ���̵�� ���� ����)
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
	//�ڹٿ��� ������� Frame�̶�� Ŭ������ ���������� ���
	public static void main(String[] args){
		Frame frame; //��ü�� �ν��Ͻ��� ����. ���� frame�� �ʱ�ȭ�Ǿ� ���� �ʴ�

		/*Frame�̶�� Ŭ������ ����϶�� ��������µ� ��� ��������� �����ϴ�
		�츮�� ������ ���� �ƴ϶� ���� �������� ���̹Ƿ�
		[�����Լ� �������� ��ü�� ����ϴ� Tip]
			1) �ش� Ŭ������ �Ӽ�, �뵵�� ��������
			2) ����� ���ؼ��� �޸𸮿� �÷��� �Ѵ�
				�޸𸮿� �ø����� �ش� ��ü�� �Ϲ�����, �߻�����, �������̽����� �����ؾ� �Ѵ�
				- �Ϲ�Ŭ������ ���: new�� ���
				- �߻�Ŭ������ ���: �ڽ��� ���� �� �ڽ��� new ó���ϸ� �ȴ�
				- �������̽��� ���: �ڽ��� ���� �� �ڽ��� new ó���ϸ� �ȴ�
			3) �޸𸮿� � ������� �ø��� �����Ǿ��ٸ�...
				- �Ϲ�Ŭ������ ��� new ������ ���� �����ڸ� ����
		*/
		frame = new Frame(); //�������� �⺻������ ���� ������ �ʵ��� �Ӽ��� �����Ǿ� �ִ�
		
		//������ �ȿ� ������ ��ư ����
		Button bt=new Button("���� �ٷ� ��ư !"); //Button is a Component!!!!
		
		/*
		��ư ���� �� ��ư�� ���ũ��� ������ ����?
		��� GUI ���α׷����� ȭ���� ��ġ ����� �����ڰ� �����ؾ� �Ѵ�
		html���� absolute, relative�� �ֵ��� GUI ���� ���� �̷��� �鿡�� ���� ��ٷӰ� �����ϴ�
		���� �츮�� �ƹ��� ��ġ(Layout)�� �������� �ʾұ� ������ �ý����� �����ϴ�
		����Ʈ ��ġ�� ����Ǿ� ���ϴ� ȿ���� ������ ���� ���̴�
		*/

		FlowLayout flow = new FlowLayout();
		//������Ʈ�� �������� ��ġ�ϴ� ���̾ƿ� ��ü
		//���� Ȥ�� �������� �������� ���ؾ� �Ѵ�

		frame.setLayout(flow); //�����ӿ� ��ġ������ ����
		
		//�Է��ؽ�Ʈ �ڽ��� �����Ͽ� �ٿ�����
		TextField t = new TextField(20); //20�� ũ���� �ʺ� Ȯ����

		//üũ�ڽ� ����
		Checkbox ch1 = new Checkbox("��ȭ");
		Checkbox ch2 = new Checkbox("���α׷���");
		Checkbox ch3 = new Checkbox("����");
		Checkbox ch4 = new Checkbox("����");
		
		//TextArea ����
		TextArea area = new TextArea(5, 15); //5��

		//html�� select�ڽ��� java������ Choice��� �Ѵ�
		Choice choice = new Choice(); //naver, google. daum
		choice.add("Choose Your E-mail");
		choice.add("naver.com");
		choice.add("google.com");
		choice.add("daum.net");

		//password
		PasswordField

		frame.add(bt); //�����ӿ� ��ư ����
		frame.add(t); //�����ӿ� �ؽ�Ʈ�ʵ� ����
		frame.add(ch1); //�����ӿ� üũ�ڽ� ����
		frame.add(ch2);
		frame.add(ch3);
		frame.add(ch4);
		frame.add(area);
		frame.add(choice);

		//���� �����ڰ� ���ϴ� Ÿ�ֿ̹� ���� ���� �� �ֵ��� �Ӽ��� �����ϴ� �޼��带 ȣ������
		//api document�� �̿��� ã��
		frame.setVisible(true); //�ƹ����� Window Ŭ�������� �������� �޼���

		//ũ�� ���� ������� ������ ���ϴ� ũ��� �����찡 ������ �ʴ´�
		frame.setSize(300, 400); //�ƹ����� Window Ŭ�������� �������� �޼���
	}
}