public class BreakDemo {
   public static void main(String[] args) {
      for(int i=1;i<=10;i++) {
	if(i%3==0){
                break;//退出当前所在的循环结构
             }
             System.out.println("i="+i);
      }
  }
}