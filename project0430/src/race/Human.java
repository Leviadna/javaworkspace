package race;

//�ΰ� �ϳ��� ����
public class Human{
	int IQ = 90;
	boolean hasName = true;
	
	public Human(int IQ){
		this.IQ = IQ;
		System.out.println("�޸��� IQ �ʱ�ȭ");
	}

	public Human(){
		System.out.println("�޸��� �ʱ�ȭ.");
	}

	public void speak(){
		System.out.println("���� �� �ִ�.");
	}

	public void drive(){
		System.out.println("������ �� �ִ�.");
	}


}