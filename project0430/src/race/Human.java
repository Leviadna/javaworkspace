package race;

//인간 하나를 정의
public class Human{
	int IQ = 90;
	boolean hasName = true;
	
	public Human(int IQ){
		this.IQ = IQ;
		System.out.println("휴먼의 IQ 초기화");
	}

	public Human(){
		System.out.println("휴먼의 초기화.");
	}

	public void speak(){
		System.out.println("말할 수 있다.");
	}

	public void drive(){
		System.out.println("운전할 수 있다.");
	}


}