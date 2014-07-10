/*
@Describe:实例变量的初始化
@Author:GongBiao
@Date:2014/07/10
*/

class Cat{
	//定义name,age两个实例变量
	String name;
	int age;
	//例用构造器初始化name、age两个实例变量
	public Cat(String name, int age){
		this.name = name;
		this.age = age;
	}
	{
		System.out.println("执行非静态初始化块");
	}
	//定义时指定初始值
	double weight = 2.3;
	public String toString(){
		return "Cat[name=" + name + ",age=" + age + ",weight" + "]"; 
	}
}
public class InitTest{
	public static void main(String[] args){
		Cat cat = new Cat("Kitty", 2);
		System.out.println(cat);
		Cat c2 = new Cat("Jerfield", 3);
		System.out.println(c2);
	}
}