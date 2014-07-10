     /*
        二元逻辑运算符
        & 逻辑与  并且
        true&true->true    true&false->false
        false&true->false  false&false->false
       总结：只有逻辑与两边都是true，结果才为true

       | 逻辑或   或者
       true|true->true    true|false->true
       false|true->true   false|false->false
      总结：只要逻辑或一边是true，结果就是true

        && 短路与  并且
        true&&true->true    true&&false->false
        false&&true->false  false&&false->false
       总结：只有短路与两边都是true，结果才为true

       || 短路或   或者
       true||true->true    true||false->true
       false||true->true   false||false->false
      总结：只要短路或一边是true，结果就是true

     */
public class Logic02 {
   public static void main(String[] args) {
      boolean flag = (5>3)&(8>9);//逻辑与
      System.out.println(flag);

      flag =  (5>3)|(8>9);//逻辑或
      System.out.println(flag);
     
      //逻辑与和短路与的区别
      int a = 10,b= 20;
      boolean fs = (a++==11)&(++b==21);
      System.out.println("fs="+fs+",a="+a+",b="+b);
      //fs=false,a=11,b=21

       int m = 10,n= 20;
      fs = (m++==11)&&(++n==21);
      System.out.println("fs="+fs+",m="+m+",n="+n);
      //fs=false,m=11,n=20
     //当短路与左边为false时，将不会执行其右边的代码即短路
   }
}