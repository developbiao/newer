/*
  用户输入一个整数，程序需要判断该数是否是水仙花数
  水仙花数：
      1.是一个三位的正整数
      2.个位、十位、百位上的数的立方之和等于该数本身
*/
import java.util.Scanner;
public class RelationShipWork {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("输入一个三位的正整数:");
      int num = sc.nextInt();
      //分别取个位、十位、百位上的数
      int ge = num%10;
      int shi = num/10%10;
      int bai = num/100%10;
      //声明变量sum，用来保存立方之和
      int sum = ge*ge*ge+shi*shi*shi+bai*bai*bai;
      //个位、十位、百位上的数的立方之和等于该数本身的关系运算
      boolean flag =  sum==num;
      System.out.println(num+"是水仙花数?"+flag);
  }
}






