package OBJ;

public class Aclass {
	public static void main(String[] args) {
	//1、学生类：自我介绍
	//2、老师类：让学生做自我介绍
	
		Student xiaoming=new Student();
		Teacher teacher=new Teacher();
		
		xiaoming.name="小明";
		xiaoming.age=13;
		xiaoming.gender='男';
		
		teacher.makeIntroduce(xiaoming);
	}
}

