/*
  用户输入一个4位表示年份的数字，请判断输入的年份是不是闰年
*/
import java.util.Scanner;
public class IfElseWork {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("请输入年yyyy:");
       int year = sc.nextInt();
       if((year%4==0&&year%100!=0)||year%400==0){
	System.out.println(year+"是闰年");
      }else{
	System.out.println(year+"是平年");
      }
      System.out.println("程序执行完毕");
  }
}