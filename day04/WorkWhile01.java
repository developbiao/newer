/*
需要：分出1000以内的水仙花数
*/

public class WorkWhile01{
	public static void main(String[] args){
		int ge;
		int shi;
		int bai;

		int i =100;
		while(i <= 999){
			ge = i % 10;
			shi = i / 100  % 10;
			bai = i / 10  % 10;	

			if ( Math.pow(ge, 3)+ (Math.pow(shi, 3)) + (Math.pow(bai, 3)) == i){
				System.out.println("这个水仙花数是：" + i);
			}

			i++;
		}
	}
}