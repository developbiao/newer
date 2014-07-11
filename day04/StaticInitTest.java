/*
静态代码块的初始化
*/

public class StaticInitTest{
	//定义count类变量，定义时指定初始化值
	static int count = 2;
	//通过静态代码块初始化name类变量指定初始的值
	static {
		System.out.println("StaticInitTest 静态代码块初始化");
		name = "Java编程";

	}

	//定义name类变量时指定初始值
	static String name = "疯狂Java讲义";

	public static void main(String[] args){
		System.out.println("类变量count的初始化值：" + count);
		System.out.println("类变量name:" + name);
	}
}