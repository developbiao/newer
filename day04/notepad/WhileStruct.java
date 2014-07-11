/*
   流程控制语句之while循环
    语法：
        while(表达式){
             循环体代码块
        }
    说明：
       a)表达式的结果必须是boolean类型的值(true/false)
       b)循环体代码块是指n(n>=1)句代码
     只要表达式结果是true,就执行循环体代码块.
*/
public class WhileStruct {
    public static void main(String[] args) {
        System.out.println("begin");
         int i = 1;//循环条件初始化
         while(i<=10){//循环条件判断
	System.out.println("i="+i);//重复执行的相同操作
             i++;//循环体条件变更
         }
       System.out.println("end");
    }
   /*
     循环三要素：
        a)循环条件初始化
        b)循环条件判断
        c)循环体条件变更
   */
}





