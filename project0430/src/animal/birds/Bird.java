package animal.birds;

//������ �ֻ��� ��ü�� �����Ѵ�. ��, ���μ� ���� �� �ִ� ������ Ư¡�� ����!
public class Bird{
	String name = "�׳� ��";
	String color;
	boolean hasWing = true;
	
	public Bird(){}

	public Bird(String color){
		this.color = color;
	}

	public void fly(String name){
		System.out.println(name+"�� ���ƴٴմϴ�.");
	}

}