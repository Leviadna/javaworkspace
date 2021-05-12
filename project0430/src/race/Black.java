package race;

public class Black extends Human{
	String color = "black";

	public Black(int IQ){
		super(IQ);
	}

	public Black(){}


	public void run(){
		System.out.println("육상을 잘한다");
	}
}