package Interface4;

public class program {

	public static void main(String[] args) {
		Dog dog=new Dog();
		
		//将这个Dog对象向上转型为接口类型——Canwalk
		Canwalk animal=dog;
		
		//让向上转型后的对象，调用接口中的方法，最终实现的是实现类中的实现方式
		//对象调用接口中成员方法，实现方式为Dog中实现方式——此为接口中的多态
		animal.walk();
	}
}
