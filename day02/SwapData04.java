/*
@Describe:Java中数组交换
@Date:2014/07/09
@Author:GongBiao
*/

public class SwapData04{
	public static void main(String[] args){
		int a = 37;
		int b = 21;

		System.out.println("a = " + a + " b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a + " b = " + b);
	}
}