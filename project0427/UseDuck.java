/*현실의 사물을 표현하기 위함이 아니라, 단지 실행부를 두기 위한 Dummy 클래스*/

class UseDuck{
	public static void main(String[] args){
		//하드디스크에 컴파일 된 오리를 메모리에 살아숨쉬게 하자 (실행 후 메모리로)
		int x = 7;
		Duck d1 = new Duck();
		
		System.out.println("di이 담고있는 오리 인스턴스의 주소 값은" + d1);

		//d1은 오리 자체를 담고 있는 게 아니라 Heap 영역에 생성된 오리 인스턴스의 주소값을
		//담고 있다. 즉 오리를 참조하고 있다고 하여 reference 변수라 한다
	}
}