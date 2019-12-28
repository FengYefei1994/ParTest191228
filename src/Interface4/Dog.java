/*
 * 注意事项：
 *1、如果接口方法在父类中已经被实现，子类可继承实现方法，不用重写实现方法；
 *       类中无显式toString方法，在dog中不用重写——在父类中已经实现
 *2、实现多个接口时，针对重复的方法，秩序定义一次。
 */

package Interface4;

public class Dog extends Animal implements CanBark,Canwalk{    //继承animal，实现Canbark（继承类，实现接口）

	//两个接口中的方法均需要重写实现
	//toString已经实现了
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void walk() {
		System.out.println("正在散步");	
	}
	
	
	//即便无Override部分，无报错，因为在CanBark类中有实现方法
}
