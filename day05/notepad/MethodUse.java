/*
   声明或定义方法语法:
     public 返回值类型  方法名([形参列表]){
    	方法体代码块
    	[return 值;]
     }
    说明：
        a)[]中的内容是可选的
        b)形参列表出现的格式为：数据类型  形参变量名;多个形参之间使
           用逗号隔开
        c)若方法没有返回值，那么返回值类型写void
        d)方法体代码块是指n(n>=1)句代码
*/
public class MethodUse {
     public void hello(){
           System.out.println("嗨!");
     }

     public int sum(int a, int b) {
           int res = a+b;
           return res;
     }

}


