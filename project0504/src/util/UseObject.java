package util;

class UseObject{
	public static void main(String[] args){
		ObjectTest ot = new ObjectTest();
		String str="monkey";

		//ot.test(); //�������� �ʴ� �޼��� ȣ��
		boolean result = ot.equals(str);
		System.out.println(ot); 
		//ot�� ��ü�̹Ƿ� ���ڿ��� �ƴ����� System.out.println()���� ����� �õ��� ��
		//���ڿ�ȭ�Ǿ� �� �ּҰ� ���� ��ȯ�ȴ�
		//�츮�� toString() �޼ҵ带 ȣ���� ���� ����. �� ���ڿ�ȭ �� �� Object Ŭ�����κ���
		//��ӹ��� toString() �޼��尡 �ڵ����� ȣ��� ��

		//�� �ڵ忡�� equals() �޼���� ObjectTest Ŭ���� ���� ���� ������ ���� ����
		//�׷����� ������ ���� ������ �ý��ۿ� ���� �̹� �����ϰ� �ִٴ� ���� �����ϱ� ����
		//����: �����ڰ� ������� �ʾƵ� �ڹ� ����� �ֻ��� Ŭ������ Object Ŭ�����κ���
	}
}