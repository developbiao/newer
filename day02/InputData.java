import java.util.Scanner;
public class InputData{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数:");

		int number = scan.nextInt();

		System.out.println("你输入的数是:" + number);
	}
}