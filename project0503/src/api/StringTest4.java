
//상수는 객체이다

package api;

public class StringTest4{
	public static void main(String[] args){
		/*
		String 클래스를 가리켜 immutable(불변)의 속성이 있다고 한다
		*/
		String s1 = "Korea";
		s1=s1+" vs USA";

		System.out.println(s1);
		
		/*
		무서운 코드
		아래의 코드는 result가 변경되는 것이 아니라
		result와 같은 값에 계속 새로운 문자열이 생성되는 것으로
		100개 이상의 문자열 상수가 메모리에 올라온다
		*/
		String result="";
		for(int i=0; i<100; i++){
			result+="apple"+i;
		}
		//System.out.println(result);
		//위 문제를 해결하기 위해선 수정 가능한 문자열 처리 관련 api를 지원받아야 한다
		//StringBuffer, StringBuilder 객체를 이용하면 된다
		StringBuffer sb = new StringBuffer(); //Striing 클래스가 아니다
		sb.append("무야호");
		sb.append(" 나는");
		sb.append(" 자바가");
		sb.append(" 싫어");

		System.out.println(sb.toString()); //toString -> Object 메서드
	}
}