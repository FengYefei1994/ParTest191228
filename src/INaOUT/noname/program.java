//匿名内部类配合抽象类或者接口使用

//匿名内部类————配合其他类使用，表示这个类的子类
package INaOUT.noname;

public class program {
	public static void main(String[] args) {
		//匿名内部类————方法括号后有引号；new的是匿名内部类对象，使用的是Animal类中的bark方法，此类可认为animal的子类
		//实例化的是animal的子类对象，并且向上转型为animal类型，所以可对bark方法重写
		Animal animal=new Animal() {	
		};
		animal.bark();
		
		//实例化一个接口的实现类对象，并且向上转型为接口类型
		Canwalk walk=new Canwalk() {
			@Override
			public void walk() {
				System.out.println("walk");
			}
		};
		walk.walk();       //匿名接口使用
	}
}

class Animal{                                 //可以更改为abstract
	public void bark(){
		System.out.println("animal bark");
	}
}

//匿名接口使用
interface Canwalk{
	void walk();
}
