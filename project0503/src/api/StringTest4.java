
//����� ��ü�̴�

package api;

public class StringTest4{
	public static void main(String[] args){
		/*
		String Ŭ������ ������ immutable(�Һ�)�� �Ӽ��� �ִٰ� �Ѵ�
		*/
		String s1 = "Korea";
		s1=s1+" vs USA";

		System.out.println(s1);
		
		/*
		������ �ڵ�
		�Ʒ��� �ڵ�� result�� ����Ǵ� ���� �ƴ϶�
		result�� ���� ���� ��� ���ο� ���ڿ��� �����Ǵ� ������
		100�� �̻��� ���ڿ� ����� �޸𸮿� �ö�´�
		*/
		String result="";
		for(int i=0; i<100; i++){
			result+="apple"+i;
		}
		//System.out.println(result);
		//�� ������ �ذ��ϱ� ���ؼ� ���� ������ ���ڿ� ó�� ���� api�� �����޾ƾ� �Ѵ�
		//StringBuffer, StringBuilder ��ü�� �̿��ϸ� �ȴ�
		StringBuffer sb = new StringBuffer(); //Striing Ŭ������ �ƴϴ�
		sb.append("����ȣ");
		sb.append(" ����");
		sb.append(" �ڹٰ�");
		sb.append(" �Ⱦ�");

		System.out.println(sb.toString()); //toString -> Object �޼���
	}
}