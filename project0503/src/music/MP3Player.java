package music;
//���� ����, mp3���� ����

/*
�߻�Ŭ������ ��ӹް� �Ǵ� �ڽ��� �θ� �ҿ����ϰ� ���ܳ��� ��������
�ҿ��� �޼��带 �ϼ��� �ǹ��� ������ �ȴ� (���������� ������ϰ� �ȴ�)
��, �θ𼼴뿡�� �ϼ����� ���� ���� �ڽ� ���뿡�� �ϼ��� ���� ���ѱ� ����
���) �߻�Ŭ������ ��ӹ��� �ڽ��� �θ� �ϼ����� ���� �߻� �޼��带 �������̵� �ؾ��Ѵ�
*/
import riding.Roller;
import aircraft.JetWing;

//�ڹٿ����� ���߻���� �Ұ����ϴ�

public class MP3Player extends MusicPlayer implements Roller, JetWing{

	public void setVolume(){
		System.out.println("mp3�÷��̾��� ������ �����մϴ�");
	}
	public void openMP3(){
		System.out.println("MP3������ �����մϴ�");
	}
	public void roll(){
		System.out.println("�Ѹ� ����� �����մϴ�");
	}
	public void fly(){
		System.out.println("������ ������ �ϴ��� ���ư��ϴ�");
	}
}