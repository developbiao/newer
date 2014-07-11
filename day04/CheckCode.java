/*
字母：大写字母（65-90）
小写字母：（97-122）
数字：(48-57)
随产生:(48-122)
问题:58-64 和91-96范围内，则重新产生
解决：若产生的数在58-64 和91-96范围的数，则重新产生，一直产生6个字符就结束
*/
import java.util.Random;
public class CheckCode{
	public static void main(String[] args){
		Random rand = new Random();
		int count = 0;

		while(true){
			int code = rand.nextInt(122) + 1;   //这是有个问题
			if((code >= 58 && code <= 64 )|| (code >=91 && code <= 96)){
				continue;

			}else{
				System.out.println(code);
				count++;
				if(count >= 6){
					break;
				}

			}

		}
		System.out.println();
	}
}

