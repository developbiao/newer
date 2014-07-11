class Base{
	//定义一个名为i的实例变量
	private int i = 2;
	public Base(){
		//System.out.println(this.i);
		this.display();
		//System.out.println(this.getClass());
	}
	public void display(){
		System.out.println(i);
	}
}

//继承Base的Derived子类
class Derived extends Base{
	//定义一个名为i的实例变量
	private int i = 22;
	//构造器，将实例变量i初始化为222
	public Derived(){
		i = 222;
	}
	public void display(){
		System.out.println(i);
	}
}

public class BaseTest{
	//创建Derived的构造器创建实例
	public static void main(String[] args){
		new Derived();
		System.out.println("is ok !");
	}

}