/*
@Discribe:TwoDimensionTest
@Author:GongBiao
@Date:2014/7/09
*/

public class TwoDimensionTest{
	public static void main(String[] args){

			//定义一个2维数组Dimenstion
			int[][] a;
			//把a当成1维数组进行初始化,初始化a为一个长度为4的数组
			//a数组的数组的元素又是引用类型
			a = new int [4][];

			//把a 当一维数组遍历
			for (int i = 0; i < a.length; i++){
				System.out.println(a[i]);
			}

			//初始化a数组第1个元素
			a[0] = new int[2];
			//访问a数组的第1个元素所指数组的和遍历a数组的每个数组
			a[0][1] = 6;
			//a数组的第1个元素是1个1维数组，遍历这个1维数组
			for (int i = 0; i < a[0].length; i ++){
				System.out.println(a[0][i]);
			}


	}
}