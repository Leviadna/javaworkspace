package modifier;

public class ModiTest{
	/*
	JAVA의 수식자(modifier)에는 static 말고도 여러가지가 있다
	개발자가 알아야 할 수식자는 총 3가지이다
	1. static: 정적 변수, 메섣, 클래스 선언시 사용
	2. final: 변수의 값을 고정할 때 사용
			변수: 상수처럼 고정시킨다
			메서드: 오버라이딩을 허용하지 않는다 (부모의 메서드를 업그레이드 할 수 없게 됨)
			클래스: 더이상 자식을 두지 않겠다 (외부 클래스에서 해당 클래스를 상속할 수 없다)
	3. abstract: 추상 클래스, 메서드 선언시 사용
	*/
	public static void main(String[] args){
		final int x=3; // 더이상 변수 x의 값은 이 시점 이후부터 변경 불가
		x=9;
	}
}
