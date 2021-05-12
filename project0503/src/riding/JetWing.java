package aircraft;

//제트엔진 기능의 날개 정의
//인터페이스는 클래스와는 달리 메서드만을 보유한, 오로지 기능만을 가진 객체이다
//따라서 인터페이스를 이용하면 다중상속의 문제를 해결할 수 있다
public interface JetWing{

	public void fly();
}