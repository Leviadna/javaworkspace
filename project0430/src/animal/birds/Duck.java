package animal.birds;

public class Duck extends Bird{
						  /*is    a*/
	String name = "�� ����";
	String color;

	public Duck(){}
	public Duck(String color){
		super(color);
		this.color = color;
	}

	public void canSwim(){
		System.out.println("���� ���� ����");
	}
}