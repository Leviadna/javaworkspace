/*������ �������� �����غ���*/
class Dog{
	/*
	�������� ���� �� �ִ� �Ӽ��� ������ ����
	�ϳ��� Ŭ������ ������ �������� ������ ��ü�� �ݿ��� ����, �Ӽ���
	ǥ���ߴٰ� �Ͽ� property��� �Ѵ�
	*/
	int age=5;
	String color="white"; //js�� ���� ���ڿ��� ��ü�� ó���Ѵ�
	String name="Bbomi";

	//�Լ�(�޼���) ����
	//public ����������, void ��ȯ���� ����
	//��, ��ȯ���� ���� �Լ��� �ǹ�
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void run(){
		System.out.println(name+"�� �پ��");
	}
}
