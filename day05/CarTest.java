public class CarTest{
	public static void main(String[] args){
		Car car1= new Car("法拉利", "black", false, 450);
		car1.CarInfo();
		System.out.println("-------------------------->");
		Car car2 = new Car();
		car2.CarInfo();
		Car car3 = new Car();
		car3.CarInfo();
	}
}