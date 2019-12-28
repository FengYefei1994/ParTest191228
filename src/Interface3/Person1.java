/*
 * 接口之间有继承（多继承）
 * 子接口可以继承父类中所有方法——NurseSer与Cooker均有cook方法，只实现一个，因为无实现方法，因此实现时随便调用任意一个效果均相同，无区别
 */

//extends: 继承
//implements:接口使用

package Interface3;

public class Person1 implements Person {           //implements 接口应用

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}

}
