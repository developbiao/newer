//String 字符串类型: 双引号引起来的0个或多个任意字符
/*
   学生类
     作者：aliax
*/
public class Student {
      //声明姓名属性
      private String name;
      //声明年龄属性
      private int age;
      //声明性别属性
      private char sex;
      //声明学号属性
      private String id;
      //声明学校名称属性
      private String school;
      //声明联系电话号码
      private String mobile;
      
      //属性的设值和取值方法
      //name属性的设值方法
      public void setName(String name){
	this.name = name;
      }
      //name属性的取值方法
      public String getName(){
	return this.name;
      }

      public void setAge(int age){
	this.age = age;
      }
      public int getAge(){
	return this.age;
      }

     public void setSex(char sex){
	this.sex = sex;
     }
     public char getSex(){
	return this.sex;
     }
     public void setId(String id){
 	this.id = id;
     }
     public String getId(){
	return this.id;
     }
     public void setSchool(String school){
	this.school = school;
     }
     public String getSchool(){
   	return this.school;
     }
     public void setMobile(String mobile){
 	this.mobile = mobile;
     }
     public String getMobile(){
	return this.mobile;
     }
	
      //方法
      public void eat(){
          System.out.println("吃...");
      }
      //方法
      public void sleep(){
         System.out.println("休息...");
      }
      //方法
      public void study(){
         System.out.println("学习...");
      }
}






