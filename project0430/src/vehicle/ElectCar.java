package vehicle;

public class ElectCar extends Car{

	public void tick(){
		//메서드의 재정의 => 오버라이딩
		System.out.println("전기동력엔진 가동 중");
	}

	public void stop(){
		System.out.println("전기동력엔진 가동 멈춤");
	}
}