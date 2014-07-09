/*
@Describe:变量的初始化练习
@Author:GongBiao
@Date:2014/07/09
*/

public class Variable04{
	public static void main(String[]  args){
		double wate_price = 2.5;
		System.out.println(wate_price);

		/*

		float pi = 3.14;
		上面的代码报编译错误：可能缺失精度
		1、在java中所有的常量 小数默认都 是double类型
		2、或需要限定于float可以在常量后面加上一个字符f或F
		*/
		float pi = 3.14F;   //这个小数是float类型
		System.out.println(pi);
	}
}