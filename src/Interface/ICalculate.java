package Interface;

/*1、定义接口类：只有成员函数及变量，无实际实现方法————只能写方法，不可以写实现体；不可以写构造方法；
 *2、接口中方法默认都是用public abstract修饰
 *3、接口中可书写属性,此时属性的修饰符默认public static final；
 *4、接口中属性定义时，必须同时完成赋初值操作。
 */

public interface ICalculate {
	final float PI=(float) 3.1415926;
	float getArea(float r);
	float getCircumference(float r);
	public abstract void test();
}