class Price{
	//类成员是Price实例
	final static Price INSTANCE = new Price(2.8);
	//再定义一个类变量
	static double initPrice = 20;
	//定义该Price的currentPrice实例变量
	double currentPrice;
	public Price(double discount){
		//根据静态变量计算实例变量
		currentPrice = initPrice - discount;
	}
}

public class PriceTest{
	public static void main(String[] args){
		//通过Price的INSTANCE访问currentPrice实例变量
		System.out.println(Price.INSTANCE.currentPrice);
		//显式创建Price实例
		Price p = new Price(2.8);
		Price p2 = new Price(10.3);
		System.out.println(p.currentPrice);
		System.out.println(p2.currentPrice);
	}
}