/*
  编程输出所有的水仙花数
   水仙花数
       1.是一个三位的正整数
       2.个位、十位、百位上数字的立方之和等于该数本身
*/
public class WhileWork01 {
   public static void main(String[] args) {
      //分析：一个三位的正整数，100-999
      int ge,shi,bai;
      int i=100;
      while(i<=999){
             //判断当前i的值是不是水仙花数
             ge = i%10;
             shi = i/10%10;
             bai = i/100%10;
             if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai){
	   System.out.println("水仙花数:"+i);
             }
             i++;
      }

  }
}