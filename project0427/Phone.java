class Phone{
	int price=5000;
	String name="������";
	static String company="Samsung";
	//static�� '������'�̶� ���� ������
	//static���� ����� ����, �޼���� new���� �ش� �ν��Ͻ��� �Ҽӵ��� �ʴ´�
	//���� ���� Ŭ������ �����ϰ� �Ǹ� ��ó�� static���� ����� ���������
	//'Ŭ���� ����'�� �Ѵ�

	public void ring(){
		System.out.println("���� ���");
	}
	public static void main(String[] args){
		Phone p1 = new Phone();
		p1.company="LG";

		company="Motor";

		Phone p2 = new Phone();
		p2.company="Sambo";

		System.out.println(p1.company);
	}
}