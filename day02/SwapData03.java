public class SwapData03{
	public static void main(String[] args){
		/*
		加减的方法第三种方法交换
		*/
		int a = 33;
		int b = 77;
		System.out.println("a = " + a  + " b = " + b);

		a = a + b;
		b = a  - b;
		a = a  - b;

		System.out.println("a = " + a  + " b  = " + b);
		System.out.println("is ok ");
	}
}