/*
@Describe:父子实例的内存控制
@Author:GongBiao
@Date:2014/07/12
*/

class Base{
	int count = 2;
	public void display(){
		System.out.println(this.count);
	}
}

class Derived extends Base{
	int count = 20;
	@Override
	public void display(){
		System.out.println(this.count);
	}
}

public class FieldAndMethodTest{
	public static void main(String[] args){
		//声明并创建一个Base对象

		Base b = new Base();  //[1]
		System.out.println(b.count);
		b.display();

		Derived d = new Derived();   //[2]
		System.out.println(d.count);
		d.display();

		//声明并创建一个Base变量，并Derived对象赋给该变量

		Base db = new Derived();  //[3]
		System.out.println(db.count);
		db.display();

		//让d2b变量指向原有所批向的Dervied对象
		Base d2b =d ;     	//[4]
		//访问d2b所指对象的count实例变量
		System.out.println(d2b.count);


	}
}