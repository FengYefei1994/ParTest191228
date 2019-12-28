/*
 * 1、定义子类中特有的其他方法
 * 2、继承父类中方法时，在类定义时，加extends关键字及引用的父类
 * 3、在子类以非私有方式继承父类成员方法、变量；
 * 4、子类与父类成员方法&该方法变量相同&返回值相同时，称为子类重写，父类被隐藏，此时访问父类成员方法或变量使用super关键字
 * 
 */

package Inherit;

public class Employer extends Employee{
	private double bonus;
	public double getbonus(){
		return bonus;
	}
	
	public void setbonus(double bonus){
		this.bonus=bonus;
	}
	
	
	@Override
	public void setName(String name){     //super关键字处理子类与父类中成员及成员变相同时，而子类有新需求时问题
		super.setName(name+"经理");
	}
	
}
