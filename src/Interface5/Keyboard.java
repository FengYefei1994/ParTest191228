package Interface5;

//public class Keyboard extends InputDevice implements USB{
public class Keyboard extends InputDevice{
	public Keyboard(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getInfo() {
		return "��������"+this.getName()+"���۸��ǣ�"+this.getPrice();
	}
	
	
}
