package vehicle;

class UseCar{
	/* 
	�ڵ����� �ν��Ͻ��� �����ϰ�
	�ڵ����� ������ ������ �̸� �� ���� ������ ����Ͻÿ�
	*/
	public static void main(String[] args){
	Car car = new Car();
	
	//������ �����Ű��
	car.e = new Engine();

	System.out.println(car.e.name);
	}
}