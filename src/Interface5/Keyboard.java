package Interface5;

//public class Keyboard extends InputDevice implements USB{
public class Keyboard extends InputDevice{
	public Keyboard(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		return "键盘名："+this.getName()+"，价格是："+this.getPrice();
	}
	
	
}
