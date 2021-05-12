package util;

class UseObject{
	public static void main(String[] args){
		ObjectTest ot = new ObjectTest();
		String str="monkey";

		//ot.test(); //존재하지 않는 메서드 호출
		boolean result = ot.equals(str);
		System.out.println(ot); 
		//ot는 객체이므로 문자열이 아니지만 System.out.println()으로 출력을 시도할 떄
		//문자열화되어 그 주소값 등이 반환된다
		//우리는 toString() 메소드를 호출한 적이 없다. 즉 문자열화 될 때 Object 클래스로부터
		//상속받은 toString() 메서드가 자동으로 호출된 것

		//위 코드에서 equals() 메서드는 ObjectTest 클래스 내에 직접 정의한 적이 없다
		//그럼에도 에러가 없는 이유는 시스템에 의해 이미 존재하고 있다는 것을 증명하기 때문
		//원인: 개발자가 명시하지 않아도 자바 언어의 최상위 클래스인 Object 클래스로부터
	}
}