/*
 * 构造方法：方法；
 * 1、没有除访问权限外的修饰符
 * 2、没有返回值：不写返回值类型部分
 * 3、构造方法与类名相同
 * 4、不能显示调用，在实例化对象时构造方法被自动调用
 * 5、构造方法默认提供原则：
 * 		a、类中无任何构造方法（包括有参、无参），系统自动提供public无参构造方法。
 * 		b、如果写了，就用写的。
 * 6、构造方法中有参、无参可同时存在。
 * 
 * 7、下面两个Person构造方法满足方法重载——类名、方法相同、参数不同
 *
 * 8、构造方法作为对象生命周期的第一个方法，一般会在构造方法中，对对象的一些属性进行初始化赋值
 */

package construct;

public class Person {
	String name;
	int age;
	char gender;
	
	/*
	 *构造方法：由于没有参数，因此被称为无参构造；输出是固定的
	 */
	Person(){
		System.out.println("随便啦！");
	}
	/*
	 *构造方法：有参数，有参构造；输出通过参数传递更改
	 */

	Person(String name){
		System.out.println(name);
	}
	
	Person(String n,int a,char c){
		name=n;
		age=a;
		gender=c;
	}
}
