/*
   流程控制语句之if语句：
    语法结构：
            if(表达式){
	   代码块
	}    
    说明：
         a)结构中表达式的结构必须是boolean类型的值(true/false)
         b)代码块是指n(n>=1)句代码
   程序执行到if结构时，首先执行if结构中的表达式，表达式结果为true,就执行代码块，程序往下执行。
  
*/
import java.util.Scanner;
public class IfStruct {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("输入一个整数：");
     int num = sc.nextInt();
     //num对2取余
     int balance  = num%2;
     //使用if结构判断余数是否为零
     if(balance==0){
         System.out.println(num+"是偶数");
     }
     System.out.println("Game Over!");
   }
}











