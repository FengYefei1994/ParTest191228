package OBJ;

public class Cat {
	
	String name;
	int age;
	
	void show1() {
	System.out.println("大家好，我是一只猫，我叫："+name+",今年"+age+"岁！");
	}
	
	void test() {
		show1();
	}
	
	static void show2() {
//		System.out.println("大家好，我是一只猫，我叫："+name+",今年"+age+"岁！");
	}
	
	static void test2() {
		show2();
	}
}
