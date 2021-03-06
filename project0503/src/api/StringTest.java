/*
sun에서 제공하는 여러 클래스 중
문자열 처리 시 중요한 기능을 담당하는
String 클래스에 대해 학습하자
*/

package api;

class StringTest{
	public static void main(String[] args){
		/*
		String 역시 import한 적이 없으나
		많이 사용되는 유용한 클래스들은 별개로 명시하지 않아도
		기본적으로 import 상태가 되어있다 (java.lang 패키지)
		*/
		String s = new String("apple");
		//오버로딩 된 여러 생성자 중 하나
		//string 클래스의 api document를 이용하여 개발자는 여러 기능을 참조할 수 있다

		//문자열의 길이를 알 수 있는 api 문서 링크
		System.out.println("문자열의 길이는 "+s.length());

		//대문자로 변환하는 메서드 api문서 링크
		System.out.println(s.toUpperCase());

		//두번째 p의 index를 반환하는 api문서 링크
		System.out.println("마지막 p의 index는 "+s.lastIndexOf("p"));

		//원하는 순서에 있는 문자 1개를 추출하는 api문서 링크
		System.out.println("charAt의 결과 "+s.charAt(4));
	}
}