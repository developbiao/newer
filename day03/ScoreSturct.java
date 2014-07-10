/*
分数判断分级
*/

import java.util.Scanner;
public class ScoreSturct{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas Enter your Socre:");
		double score = scan.nextInt();

		char ch = 'F';  //默认是F

		//A 90 -- 100	B 80 -- 90    C,60--70    F 59--60
		if(score >=90 && score <=100){
			ch = 'A';
		}else if(score >=80 && score < 90){

			ch = 'B';

		}else if(score >=70 && score < 80){
			ch = 'C';
		}else if(score >= 0 && score <  59){
			ch = 'F';
		}else{
			System.out.println("你的输入不正确，请重新输入！");
			return;
		}

		System.out.println("你的成绩评星是：" + ch );

	}
}
