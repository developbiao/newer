/*
Java的分数的分级
//A:90-100 	B:80-89	C:     70-79		D:60-69		F:0-59
*/

import java.util.Scanner;
public class ScoreSturct02{
	public static void main(String[] args){
		Scanner scan;
		scan = new Scanner(System.in);

		System.out.println("Pleas Enter your Score:");
		int score = scan.nextInt();
		char ch  = 'F';
		if (score >= 90 && score <= 100){

			ch = 'A';

		}else if(score >= 80 && score <= 89){
			ch = 'B';
		}else if(score >= 70 && score <= 79){
			ch = 'C';
		}else if(score >= 60 && score <= 69){
			ch = 'D';
		}else if(score >= 0 && score <= 59){
			ch = 'F';
		}else{
			System.out.println("你输入的分数不正确，请重新输入（分数范围在0-100）");
			return ;
		}

		System.out.println("你的分数评级为：" + ch);
	}
}