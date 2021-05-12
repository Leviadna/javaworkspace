/*이 클래스는 현실의 사물을 표현하기 위함이 아닌 그저 메인을 두기 위한 실행용 클래스일 뿐이다*/
class UseDog{
	public static void main(String[] args){
		//강아지 2마리를 메모리에서 뛰어놀게 하자 !
		//뛰어놀게 하려면 메모리에 올려야 하고 메모리에 올리려면 실행을 해야한다
		//또한 거푸집에 불과했던 강아지의 인스턴스를 생성해야 한다
		//String name=new Dog().getName();
		//System.out.println(name);

		//강아지 1마리를 메모리에 올리고 나이를 3세로 바꾼 후 변경된 나이를 출력해보시오

		//자바와 같은 객체지향 언어에서는 개발자가 자료형을 정의할 수 있다
		//이 정의는 클래스를 단위로 작성할 수 있다
		//개발자가 정의한 자료형을 '사용자 정의 자료형'이라 한다
		Dog d2 = new Dog();
		System.out.println("강아지의 변경전 나이는 "+d2.getAge());
		d2.age = 3; //d2라는 개가 보유한 age 속성값을 3으로 변경
		System.out.println("강아지의 변경된 나이는 "+d2.getAge());
		d2.name = "bomi";
		System.out.println("강아지의 이름은 "+d2.getName());
	}
}