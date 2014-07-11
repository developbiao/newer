/*
   双色球机选实现
   双色球:
        1)从1到33号选出6个红色号码，不能重复
        2)从1到16号选出1个蓝色号码
*/
import java.util.Random;
public class DouColorBallGame {
   public static void main(String[] args) {
       int[] balls = new int[33];
       //初始化33个红色号码球
       for(int i=1;i<=33;i++){
           balls[i-1]=i;
       }
       //声明保存6个红色号码的数组
       int[] red = new int[6];
       //随机选出6个红色号码,且不重复
       Random rd = new Random();
       int count=0;
       while(true){
             int index = rd.nextInt(33);      
             boolean flag = true; 
             for(int i=0;i<6;i++){
                 if(balls[index]==red[i]){
                      flag = false;
                      break;
                 }
             }
             if(flag){
             	red[count]=balls[index];
             	count++;
             }
             if(count==6){
	    break;
             }
        }
        //输出选好的6个红色号码
        for(int i=0;i<6;i++){
              System.out.print(red[i]+" ");
        }
        int blue = rd.nextInt(16)+1;
        System.out.println("-"+blue);
      
   }
}