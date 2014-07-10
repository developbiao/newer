/*
@Describe:对用户输入的三个整数求出最大的数
*/

import java.util.Scanner;
public class MathNumberDemo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleasn Eneter numA:");
		int numA = scan.nextInt();
		System.out.println("Pleasn Eneter numB:");
		int numB = scan.nextInt();
		System.out.println("Pleasn Eneter numC:");
		int numC = scan.nextInt();

		//int max = numA >= numB?numA:numB;
		//max = max >= numC?max:numC;
		int max = (numA >= numB?numA:numB) >= numC?(numA >= numB?numA:numB):numC ;

		System.out.println("numA " + numA + "  numB  " + numB + " numC "+ numC + " 最大的数是:" + max);
	}

}