/*
@Describe:变量的使用
@Author:GongBiao
@Date:2014/07/09
变量遵循原则：必须先声明变量，然后才能使用变量声明变量的语法：数据类型变量名·=[值[];
说明：a)语法中[]内容是可选的，即有可无
*/

public class Variable01{
	public static void main(String[] args){
		//声明一个int类型且名为age的变量
		int age;
		//给变量age赋值：18
		age = 18;

		//声明一个double类型，且名为price的变量同时赋值
		double price = 13.833323;

		System.out.println( age);
		System.out.println("price = " + price);

	}
}