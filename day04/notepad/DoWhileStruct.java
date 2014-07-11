/*
  流程控制语句之do-while循环
    语法:
         do{
	循环体代码块
         }while(表达式);
      说明：
       a)表达式的结果必须是boolean类型的值(true/false)
       b)循环体代码块是指n(n>=1)句代码
     只要表达式结果是true,就执行循环体代码块.  
*/
public class DoWhileStruct {
   public static void main(String[] args) {
       int i = 1;//循环条件初始化
       do{
          System.out.println("i="+i);
          i++;//循环条件变更
       }while(i<=10);//循环条件判断

   }

}






