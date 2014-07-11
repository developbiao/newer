class Creature{
	{
		System.out.println("Creature的非静态初始化块");
	}
	//下面定义两个构造器
	public Creature(){
		System.out.println("Creature的非静态的初始化");
	}

	public Creature(String name){
		////使用this调用另一个重载，无参数的构造器
		this();
		System.out.println("Creature 带name参数的构造器, name参数:" + name);

	}
}

class Animal extends Creature{
	{
		System.out.println("Animal的非静态初始化块");
	}

	public Animal(String name){
		super(name);
		System.out.println("Animal带有name参数的构造函数,name参数:" + name);
	}

	public Animal(String name, int age){
		//使用this调用另一个重载的构造器
		this(name);
		System.out.println("Animal 带2个参数的构造器，其age:" + age);
	}



}
 class Wolf extends Animal{
	{
		System.out.println("Wolf非静态代码块初始化");
	}
	public Wolf(){
			//显式调用父类有2个参数的构造器
		super("灰太狼", 3);
		System.out.println("Wolf无参数的构造器");
	}
	public Wolf(double weight){
		//使用this调用另一个重载的构造器
		this();
		System.out.println("Wolf的带weight参数" + weight);

	}
}
public class InitTest02{
	public static void main(String[] args){
		new Wolf(3.4);
	}
}