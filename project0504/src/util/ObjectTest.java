package util;

public class ObjectTest{
	String name="테스트";

	//부모가 가진 toString() 메서드가 정말 동작하는지 이 시점에서 알아보고 싶다면
	public String toString(){
		String name = this.getClass().getName();
		System.out.println(name+" 호출됨");
		return name;
	}
}