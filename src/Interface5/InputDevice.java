package Interface5;

//public abstract class InputDevice{
public abstract class InputDevice implements USB{
//�ô˾��ʾʱ��mouse��keyboard�п��Բ���ʵ��USB�࣬�̶�   USB usb1=device;\  USB usb1=keyboard; ��OK
//keyboard ����תΪUSB���ͣ���Ϊkeyboard�ĸ���InputDevice�ǽӿ�USB��ʵ����
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
	public InputDevice(String name,int price) {
		super();
		this.name=name;
		this.price=price;
	}
	
	
}
