package lesson9;

public class Farm {

	public static void main(String[] args) {
		System.out.println("调用Apple类的harvest()方法的结果：");
		Apple apple=new Apple();                                        //声明Apple类的一个对象apple，并分配内存
		apple.harvest();                                                //调用Apple的方法
		System.out.println("调用Orange类的harvest()方法的结果：");
		Orange orange=new Orange();
		orange.harvest();
	}
}
