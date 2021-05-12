/*현실의 강아지를 정의해보자*/
class Dog{
	/*
	강아지가 가질 수 있는 속성을 변수로 선언
	하나의 클래스가 보유한 변수들은 현실의 객체를 반영한 상태, 속성을
	표현했다고 하여 property라고 한다
	*/
	int age=5;
	String color="white"; //js와 같이 문자열을 객체로 처리한다
	String name="Bbomi";

	//함수(메서드) 정의
	//public 접근제한자, void 반환값이 없다
	//즉, 반환값이 없는 함수를 의미
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void run(){
		System.out.println(name+"가 뛰어요");
	}
}
