package Polymorphism;
/**
 * 该类是父类作为方法返回值的案例
 * @author Administrator
 */
public class Givefruit {
	public Fruit Givefruit(String type) {
		Fruit fruit=null;
		if(type.equals("apple")) {
			fruit=new Apple();
		}else if(type.equals("orange")) {
			fruit=new Orange();
		}else {
			fruit=null;
		}
		return fruit;
	}
}
