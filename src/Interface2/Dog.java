/*
 * 注意事项：
 *1、如果接口方法在父类中已经被实现，子类可继承实现方法，不用重写实现方法；
 *       类中无显式toString方法，在dog中不用重写——在父类中已经实现
 *2、实现多个接口时，针对重复的方法，秩序定义一次。
 */

/*有继承、有实现按先继承再实现——一个类可以在继承父类的同时实现接口
* 接口实现时，对继承无影响
* 一个实现类实现了接口，那么实现类中可以“继承”到接口中的成员
**/

package Interface2;

public class Dog extends Animal implements CanBark{

	@Override
	public void bark() {
		// TODO Auto-generated method stub	
	}	
}
