package vehicle;

class UseCar{
	/* 
	자동차의 인스턴스를 생성하고
	자동차가 보유한 엔진의 이름 및 바퀴 가격을 출력하시오
	*/
	public static void main(String[] args){
	Car car = new Car();
	
	//엔진을 존재시키기
	car.e = new Engine();

	System.out.println(car.e.name);
	}
}