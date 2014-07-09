class Cat{
	double weight;
	int age;
	public Cat(double weight, int age){
		this.weight = weight;
		this.age = age;
	}
}

public class ArrayTest01{
	public static void main(String[] args){
		//定义并动态初始化一个int[]数组
		int[] post = new int[5];
		//采用循环为每个数组元素赋值
		for (int i = 0 ; i < post.length; i++){
			post[i] = (i + 1) * 2;
		}

		//对于post数组元素来说，用起来全等于普通变量
		//下面即可将数组元素的值赋给int变量，也可将int变量的值赋元素

		int a = post[1];
		int b = 20;
		post[2] =  b;
		//定义并动态初始化一个Cat[]数组
		Cat[] cats = new Cat[2];
		cats[0] = new Cat(3.34, 2);
		cats[1] = new Cat(3.2, 2);

		//将cats数组的第1个元素的值赋给c1
		Cat c1 = cats[0];
		Cat c2 = new Cat(4.3, 3);
		//将c2的值赋给cats数组第2个元素
		cats[1] =  c2;

		System.out.println(cats[1].age);
		System.out.println(cats[1].weight);
		
	}
}