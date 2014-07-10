/*
   关系运算符
   == 等于     !=   不等于      >  大于
   <   小于     >=  大于等于   <= 小于等于
*/
import java.util.Scanner;//导入Scanner类型
public class RelationShip {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("请输入一个整数:");
     int numA = sc.nextInt();
     System.out.print("请输入一个整数:");
     int numB = sc.nextInt();     

     //声明一个boolean类型的变量,保存关系运算表达式的结果
     boolean flag;
     flag =  numA==numB;
     System.out.println(numA+"=="+numB+":"+flag);

     flag =  numA!=numB;
     System.out.println(numA+"!="+numB+":"+flag);

     flag =  numA>numB;
     System.out.println(numA+">"+numB+":"+flag);

     flag =  numA<numB;
     System.out.println(numA+"<"+numB+":"+flag);

     flag =  numA<=numB;
     System.out.println(numA+"<="+numB+":"+flag);

     flag =  numA>=numB;
     System.out.println(numA+">="+numB+":"+flag);

  }
}






