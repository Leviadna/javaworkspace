/*�ڷ����� ���õ� �н� ����*/

class TypeTest1{
	public static void main(String[] args){
		/* byte short int long float double char boolean */
		byte b=5; //1byte ������
		short s=8; //2byte ������
		//s=b; // O, ���� �Ϳ��� ū �ŷ� ���� ���̱⿡ ����
		//b=s; // X, ū �ſ��� ���� �ŷ� ������ ������ �ս� �߻�

		short s1=8;
		short s2=9;

		/*
		�Ʒ��� �ڵ尡 ������ ������ �߻��ϴ� ������?
		�������� C�� �����Ͽ� ������ ��ǻ�� �� �̸������
		������ ������ int�� �������� ����ȭ�Ǿ� �ֱ� ������
		����� int���� ���� �ڷ����� �����Ϸ��� ���� �ڵ����� �ڷ����� int�� ��ȯ�Ѵ�
		�̷��� ������ �ý��ۿ� ���� ����ȯ�̹Ƿ� '�ڵ�����ȯ'�̶�� �Ѵ�.
		����) int ���Ͽ��� ����Ǵ� ������ 
		*/
		short result = (short)(s1+s2); // +������ �����ϱ� ���� �ý����� s1, s2�� int�� ��ȯ�� �� ������ ����

		//������ ���� �ʰ� �ϴ� ��
		//�ذ�å1) short result�� int result�� ����
		//�ذ�å2) �����ڰ� �ս��� �����ϰ� �״�� �о���δ�. �̸� '��������ȯ'�̶� �Ѵ�.
		//				�̶� (�ڷ���) �Ұ�ȣ�� cast �����ڶ� �Ѵ�

		long x=65;
		int k=78;
		//�����Ϸ��� ������ ������ ���� ���� ����� �Ǵ� �����ʹ� ������ ���� �ڷ������� ������ ���߰� �����Ѵ�
		//�̶� ������ �ս��� �߻����� �ʵ��� ū �ڷ����� �������� ����ȯ�Ѵ�.
		//int result2=x+k;
		//int result2 = (int)(x+k); �սǰ����ϸ鼭���� int�� ������ ��ȯ
	}
}