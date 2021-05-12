package vehicle;

public class Car{
	//차는 엔진을 보유
	//Car has a Engine
	/*
	특정 클래스가 다른 클래스를 멤버변수로 보유한 경우  이를 has a 관계라 한다
	자바와 같은 oop언어에서 객체간 관계는 크게 2가지가 있다
	1) is a 관계: 상속관계
	2) has a 관계: 부품관계
	- oop기반으로 개발을 하다보면 여러 클래스로 개발을 하게되며
	  이 클래스간에는 관계를 형성할 수 있다 (is a, has a)
	*/
	Engine e;  //객체자료형 --> null로 초기화
	Wheel w;
	int price;  //defualt 값 0 --> 기본자료형
	String color;  //객체자료형이므로 null로 초기화 되어있음

	//부품관계 선언 후 초기화가 필요하다
	//초기화를 담당하는 영역은 생성자이며 이를 적극 활용할 필요가 있다
	public Car(){
		//has a 관계에 명시된 변수에 필요한 모든 초기화를 시도
		e = new Engine();
		w = new Wheel();
		price = 5000;
		color = "red";
	}
}