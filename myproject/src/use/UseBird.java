package use;
import  animal.Bird;
class UseBird{

	public static void main(String[] args){
		//다른 경로에 있는 클래스인 Bird를 사용해보자
		Bird b = new Bird();
		b.fly();
	}
}