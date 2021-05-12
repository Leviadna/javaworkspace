package animal.birds;

public class Duck extends Bird{
						  /*is    a*/
	String name = "난 오리";
	String color;

	public Duck(){}
	public Duck(String color){
		super(color);
		this.color = color;
	}

	public void canSwim(){
		System.out.println("수영 아주 잘함");
	}
}