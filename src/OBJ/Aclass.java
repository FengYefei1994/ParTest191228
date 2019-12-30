package OBJ;

public class Aclass {
	public static void main(String[] args) {
	//1、实例化学生，通过   对象.属性     赋值
	//2、实例化老师，通过   对象.方法    调用实现方法
	
		Student xiaoming=new Student();
		Teacher teacher=new Teacher();
		
		xiaoming.name="小明";
		xiaoming.age=13;
		xiaoming.gender='男';
		
		teacher.makeIntroduce(xiaoming);
	}
}

