/*
@Describe:对象数组的引用
@Date:2014/07/09
@Author:GongBiao
*/

 class Person{
	//年龄
	public int age;
	//身高
	public double height;
	//定义一个info方法
	public void info(){
		System.out.println("我的年龄是:" + age + "，我的身高是:" + height);
	}
}

//主类的是public文件名必须和文件名相同
public class RefrenceArrayTest{
	public static void main(String[] args){
		//定义一个Studnets数组量，其类型是Person[]
		Person[] students;
		//执行动态初始化
		students = new Person[2];
		System.out.println("students 所引用的数组长度是:" + students.length);
		//为zhang所引的Person对象属性赋值
		Person zhang = new Person();
		zhang.age = 15;
		zhang.height = 158;
		//创建一个Person实例，并将这个Person实例赋给lee变量
		Person lee = new Person();
		//为lee所引用的Person对象的属性赋值
		lee.age = 16;
		lee.height = 161;
		//将zahng变量的值赋给第2个数组元素
		students[0] = zhang;
		//将lee变量的值赋给第2个数组元素
		students[1] = lee;
		//下面两行代码的结果完全一样,因为lee和students[1]指向的是同一个Person实例
		lee.info();
		students[1].info();
	}
}
