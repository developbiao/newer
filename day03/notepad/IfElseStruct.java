/*
   流程控制语句之if-else结构
    语法：
        if(表达式){
	代码块1
        }else{
            代码块2
        }
    说明：
        a)表达式的结果必须是boolean类型的值(true/false)
        b)代码块是指n(n>=1)句代码
   根据表达式的结果，来判断是执行代码块1还是执行代码块2
   表达式结果是true，就执行代码块1;否则就是执行代码块2
*/
import java.util.Scanner;
public class IfElseStruct {
    public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.print("请输入一个整数:");
	int num = sc.nextInt();

             if(num%2==0){
                  //被2整除
	     System.out.println(num+"是偶数");
	}else{
                 //不能被2整除
	    System.out.println(num+"是奇数");
	}
            System.out.println("程序执行完毕");
    }
}







