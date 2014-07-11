/*
   随机产生6位由字母和数字组成的验证码
*/
import java.util.Random;
public class CheckCode {
   public static void main(String[] args) {       
       /*
	字母: 大写字母(65-90) 小写字母(97-122)
             数字：48-57
             随机产生整数的范围：48-122
             问题：58-64  和 91-96范围内的数是不符合需求
             解决：若产生的数在58-64  和 91-96范围内，则
	         重新产生
            一直到产生6个符合需求就结束
       */
      Random rd = new Random();
       int count=0;
      while(true){
           int num = rd.nextInt(122-48+1)+48; 
           if((num>=58&&num<=64)
		||(num>=91&&num<=96)){
	continue;
           }
           count++;
           System.out.print((char)num);
          if(count==6){
	break;
          }
     }
   }
}







