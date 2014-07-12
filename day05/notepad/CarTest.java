public class CarTest {
  public static void main(String[] args) {
      //创建一个Car类的对象
      Car car = new Car();
      /*使用setter方法给对象的属性赋值
         品牌：宝马、颜色：银色、型号：X5、排量：2.0、售价：28.89  
      */
      car.setBrand("宝马");
      car.setColor("银色");
      car.setModel("X5");
      car.setOut(2.0);
      car.setPrice(28.89);
      //输出汽车基本信息
      System.out.println("\n品牌："+car.getBrand()
		 +"\n颜色："+car.getColor()
		 +"\n型号："+car.getModel()
		 +"\n排量："+car.getOut()
		 +"\n售价：￥"+car.getPrice()+"万");
    car.start();//调用启动方法
    car.upperSpeed();//调用加速方法
    car.upperSpeed();//调用加速方法
    car.downSpeed();//调用减速方法
    

  }

}