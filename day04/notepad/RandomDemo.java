import java.util.Random;
public class RandomDemo {
   public static void main(String[] args) {
     Random rd = new Random();//获取随即产生器
      int num = rd.nextInt();//随即产生一个整数
      System.out.println(num);
      //rd.nextInt(n)表示随机产生0到9的整数
      num = rd.nextInt(10);
      System.out.println(num);
      //随机产生65到90的整数
      num = rd.nextInt(90-65+1)+65;
     //随机产生指定范围内的公式：rd.nextInt(上限-下限+1)+下限
   }

}