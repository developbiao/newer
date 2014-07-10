import java.util.Scanner;
public class RealtionShipWork{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas Enter Number:");

		int number = scan.nextInt();

		int ge = number % 10;
		int shi = number / 10  % 10;
		int bai = number /100 % 10;

		//Sum result number
		if((ge * ge * ge + shi * shi * shi + bai * bai * bai) == number){

			System.out.println("这个数是一个水仙花数!");

		}else{
			System.out.println("这个数不是水仙花数!");
		}
	}
}