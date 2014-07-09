public class ObjectArrayTest{
	public static void main(String[] args){
		//定义并初始化一个Object数组
		Object[] objArr = new Object[3];
		//让objArr所引用数组的第2个元素再次指向一个长度为2的Object数组
		objArr[1] = new Object[2];
		//将objArr[1]的值赋给objArr2,即让objArra2和objArr1[1]指向同一数组对象
		Object[] objArr2 = (Object[])objArr[1];
		//将objArra2所引用 数组的第2个元素再次指向一个长度为3的object[]数组o
		Object[]  objArr3 = (Object[])objArr[1];

		//让objArr2所引用数组的第2个元素再次指向一个长度为3的int[]数组
		objArr3[3] = new int[5];

		//将objArr3[1]的值赋给iArr,即让iArr和objArr3[1]指向同一数组对象
		int[] iArr = (int[])objArr3[1];


		//依次为iArr为数组的每个元素赋值
		for (int i = 0; i < iArr.length; i++){
			System.out.println(i);
			iArr[i] = i * 3 + 1;
		}

		//程序学习java.lang.ArrayIndexOutOfBoundsException;

		//直接通过objArr访问iArr数组的第3个元素

		//System.out.println(((int[])((Object[])((object[])objArr[1])[1])[1])[2]);
		System.out.println( ((int[]) ((Object[]) ((Object[]) objArr[1])[1])[1])[2]);

	}
}