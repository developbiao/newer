/*
输出26个字母
*/

public class OutputCh{
	public static void main(String[] args){
		/*
		int i = 1;
		char ch = 'a';

		while(i <= 26){
			//System.out.println((ch += 1 )+ " ");
			System.out.print(ch + " ");
			ch ++;
			i++;
		}

		System.out.println();
		*/

		//第二种方法

		int i = 65;
		while (i <= 90){
			System.out.print((char)i + "\t");
			i++;
		}

		System.out.println();

	}
}