/*
需求：猜数字
*/
import java.util.Scanner;
import java.util.Random;
public class guessNumber{
	public static void main(String[] args){
		Random rand = new Random();
		int Sysnum = rand.nextInt(1000) + 1;
		int number = -1;  //guess的数字
		int count = 5;
		Scanner scan = new Scanner(System.in);

		do{
			System.out.println("请输入你猜的数字:");
			 number = scan.nextInt();
			if(number == Sysnum){
				System.out.println("恭喜你猜中了!");
				System.out.println("小朋友是否继续挑战？（1 | 继续 | 0 取消）:");
				int y_n = scan.nextInt();
				if(y_n != 1){
					break;
				}else{
					Sysnum = rand.nextInt(1000) + 1;
				}


			}else{
				if (count == 0){
					System.out.println("机会用完了！");
					break;  //没有机会就跳出去了
				}
				count --;
				if(number > Sysnum){
					System.out.println("大了,你还有" + (count + 1)+ "次机会!");
				}else{
					System.out.println("小了,你还有" + (count + 1)  + "次机会!");

				}
			}

		}while(true);


	}
}