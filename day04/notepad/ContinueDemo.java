public class ContinueDemo {
   public static void main(String[] args) {
      for(int i=1;i<=10;i++) {
	if(i%3==0){
                continue;//提前结束本次循环体的执行
             }
             System.out.println("i="+i);
      }
  }
}