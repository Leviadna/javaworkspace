package util;

public class ObjectTest{
	String name="�׽�Ʈ";

	//�θ� ���� toString() �޼��尡 ���� �����ϴ��� �� �������� �˾ƺ��� �ʹٸ�
	public String toString(){
		String name = this.getClass().getName();
		System.out.println(name+" ȣ���");
		return name;
	}
}