/*자료형과 관련된 학습 연장*/

class TypeTest1{
	public static void main(String[] args){
		/* byte short int long float double char boolean */
		byte b=5; //1byte 숫자형
		short s=8; //2byte 숫자형
		//s=b; // O, 작은 것에서 큰 거로 들어가는 것이기에 가능
		//b=s; // X, 큰 거에서 작은 거로 들어가려니 데이터 손실 발생

		short s1=8;
		short s2=9;

		/*
		아래의 코드가 컴파일 에러가 발생하는 이유는?
		고전적인 C언어를 포함하여 현대의 컴퓨터 언어에 이르기까지
		정수의 연산은 int를 기준으로 최적화되어 있기 때문에
		연산시 int보다 작은 자료형은 컴파일러에 의해 자동으로 자료형을 int로 변환한다
		이러한 현상을 시스템에 의한 형변환이므로 '자동형변환'이라고 한다.
		참고) int 이하에만 적용되는 이유는 
		*/
		short result = (short)(s1+s2); // +연산을 수행하기 전에 시스템이 s1, s2를 int로 변환한 후 연산을 수행

		//에러가 나지 않게 하는 법
		//해결책1) short result를 int result로 선언
		//해결책2) 개발자가 손실을 감안하고 그대로 밀어붙인다. 이를 '강제형변환'이라 한다.
		//				이때 (자료형) 소괄호를 cast 연산자라 한다

		long x=65;
		int k=78;
		//컴파일러가 연산을 수행할 때는 연산 대상이 되는 데이터는 무조건 같은 자료형으로 수평을 맞추고 수행한다
		//이때 데이터 손실이 발생하지 않도록 큰 자료형을 기준으로 형변환한다.
		//int result2=x+k;
		//int result2 = (int)(x+k); 손실감안하면서까지 int로 강제형 변환
	}
}