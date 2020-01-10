package Polymorphism;
/**
 * 该类是多态中父类类型作为形参的案例
 * @author Administrator
 */
public class Collect {
	public Collect() {

	}

	public Collect(Fruit fruit) {
		fruit.harvest(); 
	}
}
