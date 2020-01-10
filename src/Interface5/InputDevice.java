package Interface5;

//public abstract class InputDevice{
public abstract class InputDevice implements USB {
//用此句表示时，mouse、keyboard中可以不用实现USB类，继而   USB usb1=device;\  USB usb1=keyboard; 均OK
//keyboard 可以转为USB类型，因为keyboard的父类InputDevice是接口USB的实现类
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public InputDevice(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}
