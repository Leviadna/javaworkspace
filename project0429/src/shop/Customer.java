package shop;

//아래 클래스에 대해 변수는 private, 이 변수에 대한 getter, setter
//=은닉화, encapsulation

//@lombok;
public class Customer{
	private String name;
	private int age;
	private boolean isMarry;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
	
	public void setIsMarry(boolean isMarry){
		this.isMarry = isMarry;
	}

	public boolean getIsMarry(){
		return isMarry;
	}
}