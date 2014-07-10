/*
@Describe:FieldTest
@Author:GongBiao
@Date:2014/07/10
*/

//类变量和成员变量的区别实例

class Person{
	String name;
	int age;
	static int eyeNum;
	public void info(){
		System.out.println("我的名字是:" + name + ",我的年龄是:" + age);
	}
}

public class FieldTest{
	public static void main(String[] args){
		Person.eyeNum = 2;
		System.out.println("Person的eyeNum属性:" + Person.eyeNum);

		Person p = new Person();
		p.name = "猪八戒";
		p.age = 300;
		System.out.println("通过p访问变量类变量eyeNum: " + p.eyeNum);
		p.info();

		Person p2 = new Person();
		p2.name = "孙悟空";
		p2.age = 500;
		p2.info();
		//通过p2访问类变量eyeNum:
		System.out.println("通过p2访问类变量eyeNum:" + p2.eyeNum);
		//通过p2修改Person类的eyeNum变量
		p2.eyeNum = 7;

		//分别通过p、p2和Person访问类的eyeNum类变量
		System.out.println("通过p访问类变量eyeNum:" + p.eyeNum);
		System.out.println("通过p2访问类变量eyeNum:" + p2.eyeNum);
		System.out.println("通过Person类访问类变量eyeNum:" + Person.eyeNum);





	}
}