package construct;

public class Test {
	public static void main(String[] args) {
		//尝试调用构造方法；在实例化对象时构造方法被自动调用
		//Person xiaoming=new Person();
		//Person le=new Person("X");
		
		
		//实例对象的同时，对属性进行初始化赋值
		Person xiaoming=new Person("小明",12,'男');
		System.out.println("姓名："+xiaoming.name+"，年龄："+xiaoming.age+"，性别："+xiaoming.gender+"。");
	}
}
