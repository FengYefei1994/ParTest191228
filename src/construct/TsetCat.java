package construct;

/**
 * Lesson7
 * 1、重写equals方法；
 * 2、权限修饰符应用
 */

import java.awt.Color;

public class TsetCat {

	public static void main(String[] args) {
		Cat cat1=new Cat("Java",12,21,Color.BLACK);
		Cat cat2=new Cat("C++",12,21,Color.white);
		Cat cat3=new Cat("Java",12,21,Color.black);
		System.out.println("猫咪1号的哈希码是："+cat1.hashCode());
		System.out.println("猫咪2号的哈希码是："+cat2.hashCode());
		System.out.println("猫咪3号的哈希码是："+cat3.hashCode());
		System.out.println("猫咪1号是否与猫咪2号相同："+cat1.equals(cat2));
		System.out.println("猫咪1号是否与猫咪3号相同："+cat1.equals(cat3));
	}
}
