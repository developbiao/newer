/*
   用户输入三个分别表示年、月、日的正整数，程序统计出该数字表示
的日期是那年的第几天
程序运行示例1：
请输入年(yyyy):1985
请输入月(MM|M):3
请输入日(DD|D):1
1985年3月1号是1985的第60天
程序运行示例2：
请输入年(yyyy):1984
请输入月(MM|M):3
请输入日(DD|D):1
1984年3月1号是1984的第61天
*/
import java.util.Scanner;
public class IfWork {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("请输入年(yyyy):");
      int year = sc.nextInt();
      System.out.print("请输入月(MM|M):");
      int month = sc.nextInt();
      System.out.print("请输入年(DD|D):");
      int day = sc.nextInt();

      //1985.3.1
      int sum=0;
      sum+=day;//sum=sum+day;
      if(month>1){
           sum+=31;//加上1月31天
      }
      if(month>2){
           sum+=28;//加上1月28天
      }     
      if(month>3){
           sum+=31;
      } 
      if(month>4){
           sum+=30;
      } 
      if(month>5){
           sum+=31;
      } 
      if(month>6){
           sum+=30;
      } 
      if(month>7){
           sum+=31;
      }       
      if(month>8){
           sum+=31;
      } 
      if(month>9){
           sum+=30;
      } 
      if(month>10){
           sum+=31;
      }  
      if(month>11){
           sum+=30;
      } 
     /*
       判断闰年
        满足下面任一条件即为闰年
         1.年份数字能被4整除且不能被100整除
         2.年份数字能被400整除
      */
     boolean flag1 = (year%4==0)&&(year%100!=0);
     boolean flag2 = year%400==0;

     if(flag1||flag2){
          if(month>2){
	sum++;
          }
     }
     System.out.println(year+"年"+month+"月"+day+"号是"
				+year+"年的第"+sum+"天");
  }
}