package animal.birds;

class UseBird{
	public static void main(String[] args){
		//��ü �ڷ����� ����ȯ�� ��
		Bird bird = new Bird("Red");
		Duck d = new Duck("yellow");
		
		bird = d;
		bird.fly("�������");

		Duck duck = (Duck)bird; //downCasting

		duck.canSwim();
	}
}