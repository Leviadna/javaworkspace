/*
sun���� �����ϴ� ���� Ŭ���� ��
���ڿ� ó�� �� �߿��� ����� ����ϴ�
String Ŭ������ ���� �н�����
*/

package api;

class StringTest{
	public static void main(String[] args){
		/*
		String ���� import�� ���� ������
		���� ���Ǵ� ������ Ŭ�������� ������ ������� �ʾƵ�
		�⺻������ import ���°� �Ǿ��ִ� (java.lang ��Ű��)
		*/
		String s = new String("apple");
		//�����ε� �� ���� ������ �� �ϳ�
		//string Ŭ������ api document�� �̿��Ͽ� �����ڴ� ���� ����� ������ �� �ִ�

		//���ڿ��� ���̸� �� �� �ִ� api ���� ��ũ
		System.out.println("���ڿ��� ���̴� "+s.length());

		//�빮�ڷ� ��ȯ�ϴ� �޼��� api���� ��ũ
		System.out.println(s.toUpperCase());

		//�ι�° p�� index�� ��ȯ�ϴ� api���� ��ũ
		System.out.println("������ p�� index�� "+s.lastIndexOf("p"));

		//���ϴ� ������ �ִ� ���� 1���� �����ϴ� api���� ��ũ
		System.out.println("charAt�� ��� "+s.charAt(4));
	}
}