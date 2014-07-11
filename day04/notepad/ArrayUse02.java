public class ArrayUse02 {
   public static void main(String[] args) {
        int[] scores = {98,68,87};
        int temp = scores[0];
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
 
        scores[0]=92;
        scores[1]=scores[1]-5;
        for(int i=0;i<3;i++){
        	System.out.println(scores[i]);
        }      

   }
}