/*
子类重写父类的方法

*/

class Animal{
	//desc实例变量保存对象toString方法的返回值
	private String desc;
	public Animal(){
		//调用getDesc方法初始化desc实例变量
		this.desc = getDesc();       //[2]
	}
	public String getDesc(){
		return "Animal";
	}
	public String toString(){
		return desc;
	}
}

class Animal2{
	public String getDesc(){
		return "Animal";

	}
	public String toString(){
		return getDesc();
	}

}


public class Wolf extends Animal2{
	//定义name、weight两个实例变量

	private String name;
	private double weight;
	public Wolf(String name, double weight){
		//定义name,weight两个实例变量
			this.name = name;		//[3]
			this.weight = weight;
		}

		//重写父类的getDesc()方法
		@Override
		public String getDesc(){
			return "Wolf[name=" + name + ", weight=" + weight + "]" ;
		}

		public static void main(String[] args){
			System.out.println(new Wolf("灰太狼", 32.3));    //[1]

		}


	}

