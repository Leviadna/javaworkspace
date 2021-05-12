package animal.birds;

//조류의 최상위 객체를 정의한다. 즉, 새로서 가질 수 있는 보편적 특징을 정의!
public class Bird{
	String name = "그냥 새";
	String color;
	boolean hasWing = true;
	
	public Bird(){}

	public Bird(String color){
		this.color = color;
	}

	public void fly(String name){
		System.out.println(name+"가 날아다닙니다.");
	}

}