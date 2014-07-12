/*
输出汽车的基本信息
*/
import java.util.Random;
class Car{
	private  String pinpai;
	private  String color = "yellow";
	private String version = "X5";
	private static double price = 500000;
	private boolean open;
	private int speed;
	private static int Id;

	public Car(){
		Id++;
	}

	Random rand = new Random();

	public Car(String pinpai, String color, boolean open, int speed){
		this.pinpai = pinpai;
		this.color = color;
		this.open = open;
		this.speed = speed;

		Id = rand.nextInt();

	}

	//abbrev
	public void setPinpai(String pinpai){
		this.pinpai = pinpai;
	}
	public String getPinpai(){
		return this.pinpai;
	}

	//color
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	//version

	public void setVersion(String version){
		this.version = version;
	}
	public String getVersion(){
		return this.version;
	}


	//perice
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}

	//open

	public void setOpen(boolean open){
		this.open = open;
	}

	public boolean getOpen(boolean open){
		return this.open;
	}

	//speed
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed(){
		return speed;
	}

	//Method

	public void CarInfo(){

		System.out.println("品牌： " + pinpai + "\nColor: " + color + "\nVersion " +  version + "\n价钱： " + price + "\n状态：" + open + "\n速度：" + speed);
		System.out.println("编号：" + Id);

	}
}

