public class StudentTest {
   public static void main(String[] args) {
       //创建Student类的实例,或创建Student类的对象
       Student s = new Student();
      //访问的类成员使用成员运算符 .
      //访问语法：对象名.属性名   对象名.方法名(...)
      //调用setName方法给name属性赋值
      //调用某个方法，就是执行被调用方法中的代码
      s.setName("张三");      
      String na = s.getName();
      System.out.println("姓名："+na);

      s.setSchool("家里蹲大学");
      System.out.println("学校："+s.getSchool());
       

    }
}