package construct;

import java.awt.Color;

public class TsetCat {

	public static void main(String[] args) {
		Cat cat1=new Cat("Java",12,21,Color.BLACK);
		Cat cat2=new Cat("C++",12,21,Color.white);
		Cat cat3=new Cat("Java",12,21,Color.black);
		System.out.println("è��1�ŵĹ�ϣ���ǣ�"+cat1.hashCode());
		System.out.println("è��2�ŵĹ�ϣ���ǣ�"+cat2.hashCode());
		System.out.println("è��3�ŵĹ�ϣ���ǣ�"+cat3.hashCode());
		System.out.println("è��1���Ƿ���è��2����ͬ��"+cat1.equals(cat2));
		System.out.println("è��1���Ƿ���è��3����ͬ��"+cat1.equals(cat3));
	}
}
