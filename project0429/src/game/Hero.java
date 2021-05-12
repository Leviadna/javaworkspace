package game;

/*
js와 마찬가지로 객체의 인스턴스를 생성할 때 
초기화 작업을 담당하게 될 메서드를 생성자 메서드라 한다
대부분의 oop언어(java, c#등)에서는 생성자 메서드명은 클래스명과 일치시켜야 한다
------------------
java 생성자의 특징
------------------
1) 반환형을 두면 안된다
2) 생성자의 명칭은 반드시 해당 클래스와 일치해야 한다
*/
public class Hero{ //문을 여시오~
	int width;
	int heigth;
	int x;
	int y;
	
	//이와같이 개발자가 초기화의 의지를 갖고 생성자를 정의하면 시스템에 의한
	//즉, 컴파일러에 의한 디폴트 생성자는 정의되지 않는다. 따라서 
	public Hero(int x, int y){
		this.x=x;
		this.y=y;
	}
	//생성자 이름이 같지만 매개변수로 구분이 가능한 오버로딩을 사용할 수 있다
	public Hero(){
	}
	//개발자가 생성자를 통한 초기화를 하지 않으면 이 객체를 생성하는 new연산자
	//다음에 오는 생성자, 호출시 에러가 발생하게 되므로 sun에서는 이를 방지하기 위해
	//개발자가 정의해야 할 생성자를 살짝 디폴트 생성자라는 역할로 정의해 놓는다
	//즉, 시스템에 의해 생성자가 정의되며 이 때 시스템에 의한 생성자 정의라는 관여는
	//최대한 관여? 최소한 관여? O 이때 최소환의 관여만하므로 시스템에 의한 디폴트
	//생성자의 코드에는 아무것도 들어있지 않다 (empty)
/*
	public Hero(){
		시스템에 의해 디폴트 생성자가 정의된다
	}
*/
}