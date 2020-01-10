package Polymorphism;

//定义抽象类
abstract class Fruit {

	// 定义颜色成员变量
	public String color;

	
	//定义成员函数————————有参、无参均可，重要的是有结构体——{}
	//当方法名与类名相同————构造方法（有参、无参）
	public Fruit() {
		color = "绿色"; // 对color进行初始化
	}
	
	//定义成员函数————————抽象方法，抽象方法的类一定是abstract类型；相比基础类，没有结构体
	public abstract void harvest();
}

