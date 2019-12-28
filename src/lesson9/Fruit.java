package lesson9;
//定义抽象类

abstract class Fruit {                      //定义抽象类
	public String color;                    //定义颜色成员变量
	//定义构造方法
	public Fruit() {
		color="绿色";                        //对color进行初始化
	}
	//定义抽象方法
	public abstract void harvest();//相比基础类，没有结构体
}


/*构造基础类（Fruit）、定义成员变量、成员方法

*public class Fruit {
	public String color;
	public Fruit() {
		color="绿色";
	}
	成员函数（有参、无参均可，重要的是有结构体——{}）
	public void harvest() {
	}
}
*/

/*定义接口类：只有成员函数及变量，无实际实现方法

public interface ICalculate {
final float PI=(float) 3.1415926;
float getArea(float r);
float getCircumference(float r);
}
*/