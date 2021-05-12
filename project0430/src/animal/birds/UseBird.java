package animal.birds;

class UseBird{
	public static void main(String[] args){
		//객체 자료형의 형변환의 예
		Bird bird = new Bird("Red");
		Duck d = new Duck("yellow");
		
		bird = d;
		bird.fly("도날드덕");

		Duck duck = (Duck)bird; //downCasting

		duck.canSwim();
	}
}