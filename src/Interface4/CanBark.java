package Interface4;

public interface CanBark {
	void bark();                //抽象方法
	String toString();          //同样抽象方法
	
/*
 *1、Java8 及以后，接口中新增static修饰方法，针对static方法需添加实现方法。此静态方法调用时用接口调用。
 *2、Java8中可以用default修饰接口方法，需加实现方法——给接口添加一个默认的实现方法，重写与否均可;此方法用对象调用
 */
	

	static void show() {
		System.out.println("Hello World!");
	}
	
	default void display() {
		System.out.println("哈");
	}
}
