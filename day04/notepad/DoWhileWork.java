import java.util.Scanner;
import java.util.Random;
public class DoWhileWork {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int sysNum  = rd.nextInt(1000)+1;
        int guess = -1;
        boolean flag = true;
         do{
            System.out.print("1-1000的数，请猜:");
            guess = sc.nextInt();
            if(guess>sysNum){
                 System.out.println("大了");
            }else if(guess<sysNum){
	    System.out.println("小了");
            }else{
	   System.out.println("恭喜您，获得如花小姐同饮机会!");
                System.out.print("小样,敢继续挑战?1:继续0:退出");
                guess = sc.nextInt();
                if(guess==1){
	       sysNum  = rd.nextInt(1000)+1;
                }else{
		flag = false;
                }
                
            }
          }while(flag);
  
    }

}