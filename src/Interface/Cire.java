package Interface;

/*
 * 1、接口：定义之后，给某一个类去实现，使用implement关键字
 * 2、使用接口、继承类两者并无冲突——先写继承再写实现：public abstract class Cire extends Obj implements ICalculate{}
 * 3、一个类实现了一个接口，这个类称为接口的实现类
 * 4、接口可供多个类实现，一个类可实现多个接口
 */

public abstract class Cire implements ICalculate{
	public float getArea(float r) {
		float area =PI*r*r;
		return area;
	}
	
	public float getCircumference(float r) {
		float circumference =2*PI*r;
		return circumference;
	}
}
