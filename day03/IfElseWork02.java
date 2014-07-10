/*
需求：输入两个人的年龄，姓名判断能不能结婚
*/

import java.util.Scanner;
public class IfElseWork02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你的性别（0-女 1男）：");
		int sex1 = scan.nextInt();
		System.out.println("请输入你的年龄:");
		int age1 = scan.nextInt();

		int sex2;
		int age2;


		System.out.println("------------------------------------------>>");


		if(sex1 == 0){ //知道他是男还是女
			System.out.println("请输入男方性别：");
			 sex2 = scan.nextInt();
			System.out.println("请输入男方年龄：");
			 age2 = scan.nextInt();

		}else{
			System.out.println("请输入女方性别：");
			 sex2= scan.nextInt();
			System.out.println("请输入女方年龄：");
			  age2 = scan.nextInt();

		}

		//判断是男还是女，sex1男, sex2女最终的结果
		if(sex1 == 0){
			//交换数据
			sex1 = sex1 ^ sex2;
			sex2 = sex1 ^ sex2;
			sex1 = sex1 ^ sex2;

			age1 = age1 ^ age2;
			age2 = age1 ^ age2;
			age1 = age1 ^ age2;
		}

			//System.out.println(age2);
		if(sex1 + sex2 == 1 && age1 >= 22 && age2 >= 20){

			System.out.println("恭喜！你们可以结婚了！");
		}else{

			System.out.println("Sorry!目前相关法律不允许你们不能结婚！");
		}

	}

}