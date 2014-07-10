/*
   流程控制语句之if-else if-else if-else结构
   语法：
         if(表达式1){
             代码块1
         }else if(表达式2){
 	代码块2
         }else if(表达式n){
	代码块n
         }[else{
	代码块x
         }]
     说明：
         a)所有表达式的结果必须都是boolean类型的值(true/false)
         b)代码块是指n(n>=1)句代码
         c)语法[]中的内容是可选的即可有可无
     首先执行表达式1，若表达式1结果是true，则执行对应的代码块1;
     若表达式1的结果是false,则去执行下一个表达式，以此类推。
    只有当所有表达式的结果都是false,且存在else的代码块x，就会执行
    代码块x。
*/
import java.util.Scanner;
public class IfElseIfStruct {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("请输入您的成绩：");
      int score = sc.nextInt();
      char ch = 'F';
      //A:90-100   B:80-89  C:70-79  D:60-69  F:0-59
      if(score>=90&&score<=100){
            ch = 'A';
      }else if(score>=80&&score<=89){
            ch='B';
      }else if(score>=70&&score<=79){
            ch='C';
      }else if(score>=60&&score<=69){
            ch='D';
      }else if(score>=0&&score<=59){
            ch='F';
      }else{
           System.out.println("输入错误，请重新输入!");
      }
      System.out.println("您的成绩评级结果："+ch);


  }
}





