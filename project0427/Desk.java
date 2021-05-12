public class Desk {
	int x;
	static int y;
	
	{ //A
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { //B, 클래스가 로드될 때 즉, 실행 시 동작한다 (main에서 호출 시)
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
		//System.out.println(x); //C --> 메모리에 올라온 적도 없고 static 영역에서 레퍼런스 변수 없이 x를 접근할 수도 없다
		int a=new Desk().x; //D
		System.out.println(a); //E
		System.out.println(y); //F
	}
}
