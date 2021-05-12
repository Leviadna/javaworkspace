package vehicle;

class UseCar{
	public static void main(String[] args){
		Car car = new ElectCar();
		car.turnOnLight();
		car.tick();
	}
}