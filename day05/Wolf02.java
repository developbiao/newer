/*
分析继承关系
*/
class Animal{
	public String name;
	public void info(){
		System.out.println(name);

	}
}

public class Wolf02 extends Animal{
	private double weight;
}