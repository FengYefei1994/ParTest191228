package Interface5;

//public class Mouse extends InputDevice implements USB{
public class Mouse extends InputDevice{

	public Mouse(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getInfo() {
		return "�������"+this.getName()+"���۸��ǣ�"+this.getPrice();
	}
}
