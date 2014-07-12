public class Car {
    private String brand;//品牌
    private String color;//颜色
    private String model;//型号
    private double out;//排量
    private double price;//售价

    public void setBrand(String brand){
	this.brand = brand;
    }
    public String getBrand(){
	return this.brand;
    }
    public String getColor(){
   	return this.color;
    }
    public void setColor(String color){
    	this.color = color;
    }
    public void setModel(String model){
	this.model = model;
    }
    public String getModel(){
	return this.model;
    }
    public void setOut(double out){
	this.out = out;
    }
    public double getOut(){
	return this.out;
    }
    public void setPrice(double price){
	this.price = price;
    }
    public double getPrice(){
	return this.price;
    }
    public void start(){
 	System.out.println("启动汽车...");
    }
    public void upperSpeed(){
      System.out.println("速度提升10");
    }
    public void downSpeed(){
      System.out.println("速度下降10");
    }
}