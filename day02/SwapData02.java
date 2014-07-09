public class SwapData02{
	/*
	第二种方法异或的方法交换
	*/
	public static void main(String[] args){
		int a = 33;
		int b = 77;

	      	System.out.println("a=" + a + "   b=" + b);

		a = a ^ b;   //000101001
		b  = a ^ b; //111101001 10001010
		a = a ^ b; //100001010

		System.out.println("a=" + a + "   b=" + b);
	}
}