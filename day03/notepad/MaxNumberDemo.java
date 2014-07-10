/*
    对用户输入的三个整数求出最大数
  */
import java.util.Scanner;
public class MaxNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int numA = sc.nextInt();
        System.out.print("请输入一个整数：");
        int numB = sc.nextInt();
        System.out.print("请输入一个整数：");
        int numC = sc.nextInt();
        //将numA和numB中大的数保存到变量max中
        int max = numA>=numB?numA:numB;
        //将max和numC中大的数保存到变量max中
        max = max>=numC?max:numC;
        System.out.println(numA+","+numB+","+numC
				+"中最大数是："+max);
    }

}