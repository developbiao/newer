/*
   输入两个人的基本信息(性别，年龄)，判断是否可以办理结婚证书
   性别信息使用数字表示：0-女  1-男
   可以办理结婚证书的条件：
       1.一男一女
       2.男性必须22岁及以上，女性必须20岁及以上
*/
import java.util.Scanner;
public class IfElseWork02 {
     public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
	System.out.print("请输入您的性别(0-女  1-男)：");
             int sex1 = sc.nextInt();
             System.out.print("请输入您的年龄：");
             int age1 = sc.nextInt();

	System.out.print("请输入您的性别(0-女  1-男)：");
             int sex2 = sc.nextInt();
             System.out.print("请输入您的年龄：");
             int age2 = sc.nextInt();
             //假设第一个人属于男性信息,第二个人属于女性信息
             boolean  flag1 = 
		(sex1==1&&age1>=22)&&(sex2==0&&age2>=20);
            //假设第一个人属于女性信息,第二个人属于男性信息
 	boolean  flag2 = 
		(sex1==0&&age1>=20)&&(sex2==1&&age2>=22);
           if(flag1 ||  flag2 ){
	  System.out.println("通过审批，准予办理");
           }else{
	 System.out.println("不符合现有法律，不准予办理");
           }
          System.out.println("程序结束");
    }
}