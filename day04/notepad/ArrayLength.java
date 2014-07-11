/*
数组有一个名为length的属性，这个属性存储了数组的大小或长度。也就是说我们可以通过数组的length属性获取数组的大小或长度。
   访问length属性语法:        
         数组名.length
eg:
  int[] ary = new int[5];
  int size =  ary.length;
//因为ary.lenth的值为5，所以赋给变量size值为5

小结：数组下标取值范围：[0,数组名.length-1]

*/
public class ArrayLength {
   public static void main(String[] args) {
         int[] data = {1,2,3,4,5,6,7,8};
         for(int i=0;i<data.length;i++){
	  System.out.println(data[i]);
         }
   }

}